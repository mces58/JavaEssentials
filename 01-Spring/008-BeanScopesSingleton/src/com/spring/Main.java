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
		 * goruldugu gibi iki nesne ayni yeri gosteriyorlar yani aslinda burada tek bir
		 * nesne var diyebiliriz. Bunun nedenine gelecek olusak bunu scope ozelliginin
		 * singleton olmasindan kaynaklaniyor. Bunu soyle dusunebilirsin sanki bir defa
		 * nesne new'leniyor geriye uretilen nesneler bundan uretiliyor bir nevi
		 * new'leme yok gibi dusunebilirsin. Normalde dao class'lari manager
		 * class'larina gonderilir ama ornek olsun diye burada dao class'larini
		 * new'ledim.
		 */

		// birde manager class'i icin yapalim
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
		 * manager class'lari icinde singleton degeri verince nesneler ayni yeri
		 * gosterdiler. Nesneler farkli yeri gosterisin diyorsan bu sefer singleton
		 * degeri yerine baska deger vermen gerekir bir sonraki projede bunu yaptik
		 */

		context.close();
	}
}
