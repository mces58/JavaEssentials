package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.business.CustomerService;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(IocConfiguration.class);
		CustomerService customerService = context.getBean("service", CustomerService.class);

		customerService.insert();

		context.close();
	}
}
