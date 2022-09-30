package com.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.business.Manager;
import com.aop.config.Config;
import com.aop.entity.Product;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Manager manager = context.getBean("manager", Manager.class);
		Product product = new Product("Telefon", 5, 7000);

		manager.insert(product);

		manager.getAllProduct();

		manager.delete(product);

		context.close();
	}
}
