package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.business.CustomerService;

public class Main {
	public static void main(String[] args) {
		// Qualifier injection with constructor

		// bu injection turunde de 3 cesit vardir
		// constructor, setter ve field ile enjekte edebiliriz

		/*
		 * simdi dao class'larinin hepsinin basina component ekledim ve calistirmayi
		 * denedim hata aldim cunku program hangi class'tan nesne uretecegini
		 * anlayamadi. customerManager'in constructor'i parametre olarak bir dao class'i
		 * istiyor lakin o 1 tane isterken biz 3 tane birden gonderdik burada spesifik
		 * olarak bir tanesini ayirmaliyiz ki ona gore o parametre customerManager
		 * class'ina gitsin. Bu spesifikligi Qualifier anatasyonu yapacaktir. Bu
		 * anatasyonu CustomerManager class'inda kullanmamiz gerekir cunku dao
		 * class'lari oaraya parametre olarak gidiyor
		 */
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService customerService = context.getBean("customerManager", CustomerService.class);

		customerService.insert();

		context.close();
	}
}
