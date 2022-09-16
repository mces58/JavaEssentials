package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// annotation injection

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// camel casing dikkat et
		CustomerDAO customerDAO = context.getBean("msSqlCustomerDAO", CustomerDAO.class);
		customerDAO.insert();

		context.close();
	}
}
