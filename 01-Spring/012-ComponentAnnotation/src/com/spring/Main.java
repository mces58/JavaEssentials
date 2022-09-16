package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// annotation injection

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerDAO customerDAO = context.getBean("database", CustomerDAO.class);
		customerDAO.insert();

		context.close();
	}
}
