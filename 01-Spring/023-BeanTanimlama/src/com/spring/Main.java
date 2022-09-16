package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(IocConfiguration.class);

		CustomerDAO customerDAO = context.getBean("database", CustomerDAO.class);
		// burada referans gonderdigimiz database ismi ile configuration
		// dosyasinda olusturdugumuz isim ile ayni olmak zorundadir.
		customerDAO.insert();

		context.close();
	}
}
