package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// hangi database ile calismak istiyorsan o bean'e ait id degerini kullan
		Database database = context.getBean("oracle", Database.class);

		System.out.println("url: " + database.getUrl());
		System.out.println("userName: " + database.getUserName());
		System.out.println("password: " + database.getPassword());
		System.out.println("list: " + database.getList());

		context.close();
	}
}
