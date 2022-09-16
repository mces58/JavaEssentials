package com.spring;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// farkli dillerin destegini projeye dahil ediyoruz
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		String messageUS = context.getMessage("fail.login.message", null, Locale.US);
		System.out.println(messageUS);

		// tr diye local olmadigi icin kendi localimizi yazdik
		Locale locale = new Locale("tr", "TR");
		String messageTR = context.getMessage("fail.login.message", null, locale);
		System.out.println(messageTR);
		context.close();
	}
}
