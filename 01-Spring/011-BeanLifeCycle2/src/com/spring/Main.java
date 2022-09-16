package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SportManager manager = context.getBean("manager", SportManager.class);
		manager.doSportsDaily();

		context.close();
		/*
		 * hazir init ve destroy fonksiyonlarini kullanabilmek icin InitializingBean,
		 * DisposableBean interface'lerini implement etmek gerekir sonrada onlarin
		 * fonksiyonarini override ederek kullanabiliriz.
		 * 
		 * hazir init ve destroy fonksiyonlarini kullanamak icin ayrica xml dosyasinda
		 * belirtmeye gerek yok otomatik olarak calisir kendi yazdigimiz init ve destroy
		 * metotlarini belirtmek yeterlidir.
		 */

	}
}
