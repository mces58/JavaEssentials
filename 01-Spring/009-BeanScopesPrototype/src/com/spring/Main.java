package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SportDAO sportDAO = context.getBean("mySport", SportDAO.class);

		SportDAO sportDAO2 = context.getBean("mySport", SportDAO.class);

		if (sportDAO == sportDAO2) {
			System.out.println("Bu iki nesne ayni yeri gosteriyor");
			System.out.println(sportDAO);
			System.out.println(sportDAO2);
		} else {
			System.out.println("Bu iki nesne ayni yeri gostermiyorlar");
			System.out.println(sportDAO);
			System.out.println(sportDAO2);
		}
		/*
		 * bir onceki projede singleton idi burada da singleton yaptik cunku manager
		 * class'ina constructor-arg ile gonderdik. bir degisim olacak mi diye kontrol
		 * ettik lakin olmadi.yani manager class'ina bir nesne gonderdik gibi
		 * dusunebilirsin ama manager class'inda scope ozelligini prototype yaptik
		 * boylece iki farki nesne olustu
		 */

		SportManager manager = context.getBean("manager", SportManager.class);

		SportManager manager2 = context.getBean("manager", SportManager.class);

		if (manager == manager2) {
			System.out.println("\nBu iki nesne ayni yeri gosteriyor");
			System.out.println(manager);
			System.out.println(manager2);
		} else {
			System.out.println("\nBu iki nesne ayni yeri gostermiyorlar");
			System.out.println(manager);
			System.out.println(manager2);
		}
		/*
		 * bir onceki projede bu iki nesne ayni yeri gosterirken simdi farkli yerleri
		 * gosteriyorlar yani simdi iki farkli nesne oldular bunu ise scope ozelliginin
		 * prototype olmasindan kaynaklaniyor. her nesne icin yeni bir new'leme
		 * yapiliyormus gibi dusunebilirsin ama singleton'da ise bir kere new'lenip
		 * diger nesneler ondan turuyormus gibi dusunebilirsin
		 */
		context.close();
	}
}
