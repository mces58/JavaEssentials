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
		 * init ve destroy fonksiyonlari baslangic ve bitis fonksiyonlaridir. Bu
		 * fonksiyonlar bean olusturdugumuzda kullanilir. init bean olustugunda ilk
		 * calisan metotdur. destroy ise bean bitmeden once son calisan metotdur.
		 * 
		 * baska bir onemli ozellik ise scope ozelligi prototype olunca destroy
		 * fonksiyonunun calismamasidir.
		 * 
		 * biz burada init ve destroy fonksiyonlarini elimizle yazdik bir de bunlarin
		 * hazir halleri var onlari kullanarakta yapabiliriz. Bunuda bir sonraki projede
		 * yapalim
		 */

	}
}
