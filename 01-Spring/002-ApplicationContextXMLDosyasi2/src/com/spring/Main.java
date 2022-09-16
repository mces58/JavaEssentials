package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ikinci bir ornek
		// bir kac farkli sekilde xml dosyasini okuyabiliriz

		// 1. yontem
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// context.close();

		// 2. yontem
		// BeanFactory context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// bunun close metodu yok genelde kullanilmaz

		// 3. yontem
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// context.close();

		// 4 yontem
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// bunun da close metodu yok

		// 5. yontem genelde bu kullanilir daha detayli bir kullanima sahip oldugu icin
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SportManager manager = new SportManager(context.getBean("mySport", SportDAO.class));

		manager.doSportsDaily();

		context.close();
	}
}
