package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.business.CustomerService;

public class Main {
	public static void main(String[] args) {

		// setter injection

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService customerService = context.getBean("service", CustomerService.class);
		customerService.insert();

		context.close();
	}
}
