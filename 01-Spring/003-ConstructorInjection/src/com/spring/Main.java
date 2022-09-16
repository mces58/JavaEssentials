package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.business.CustomerService;

public class Main {
	public static void main(String[] args) {

		// constructor arg ile ic ice bagimlilik cozumu (constructor injection)

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		 * ICustomerService customerService = context.getBean("service",
		 * ICustomerService.class);
		 * 
		 * customerService.add();
		 * 
		 * bu sekilde kullandigimizda patliyoruz cunku bizim customerService dedigimiz
		 * sey aslinda CustomerManager ve CustomerManager'in bir constructor'i var ve bu
		 * constructor bir paramatre aliyor biz eger boyle yapar isek constructor'a
		 * parametre gondermemis oluruz ve patlariz dolayisiyla parametreli
		 * constructor'li class'larda constructor injection kullanilmalidir bu yukarida
		 * yaptigimizin esiti asagida ki gibidir
		 * 
		 * CustomerManager manager = new CustomerManager();
		 * 
		 * bu halde iken bizde new'leyemeyiz cunku CustomerManager icinde constructor
		 * var yani buna parametre gondermeliyiz
		 * 
		 * dolayisiyla bizim de xml dosyasinda birkac duzenleme yapmaliyiz bu duzenleme
		 * constructor arg dahil etmektir
		 */

		CustomerService customerService = context.getBean("service", CustomerService.class);
		customerService.insert();

		context.close();

		// Kisacasi constructor olan class'larda constructor injection yapmaliyiz
	}
}
