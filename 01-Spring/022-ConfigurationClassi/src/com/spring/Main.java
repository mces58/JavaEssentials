package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ConfigurableApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		// yukarida ki ifade hala xml dosyasi icin calisir bunu duzeltmemiz
		// gerek cunku elimizde artik xml dosyasi yok

		// bunuda AnnotationConfigApplicationContext class'i ile duzeltebiliriz
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(IocConfiguration.class);
		// parametre olarak xml dosyamiz yerine gecen configuration class'imizi
		// vermeliyiz

		CustomerDAO customerDAO = context.getBean("mySqlCustomerDAO", CustomerDAO.class);
		customerDAO.insert();

		context.close();

	}
}
