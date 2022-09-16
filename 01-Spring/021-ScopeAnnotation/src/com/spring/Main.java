package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SportDAO sportDAO = context.getBean("footballDAO", SportDAO.class);

		SportDAO sportDAO2 = context.getBean("footballDAO", SportDAO.class);

		if (sportDAO == sportDAO2) {
			System.out.println("Bu iki nesne ayni yeri gosteriyor");
			System.out.println(sportDAO);
			System.out.println(sportDAO2);
		} else {
			System.out.println("Bu iki nesne ayni yeri gostermiyorlar");
			System.out.println(sportDAO);
			System.out.println(sportDAO2);
		}

		// birde manager class'i icin yapalim
		SportManager manager = context.getBean("sportManager", SportManager.class);

		SportManager manager2 = context.getBean("sportManager", SportManager.class);

		if (manager == manager2) {
			System.out.println("\nBu iki nesne ayni yeri gosteriyor");
			System.out.println(manager);
			System.out.println(manager2);
		} else {
			System.out.println("\nBu iki nesne ayni yeri gostermiyorlar");
			System.out.println(manager);
			System.out.println(manager2);
		}

		context.close();
	}
}
