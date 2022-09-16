package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// xml dosyasi ile cagirma
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Collections collections = context.getBean("collections", Collections.class);

		System.out.println(collections.getName() + "\n");

		collections.printList();
		System.out.println(collections.getCars() + "\n");

		collections.printMap();
		System.out.println(collections.getDictionary());

		context.close();

		// xml dosyasi olmadan cagirma
		ConfigurableApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Collections collections2 = context2.getBean("collections", Collections.class);

		System.out.println(collections2.getName() + "\n");

		collections2.printList();

		collections2.printMap();

		context2.close();
	}
}
