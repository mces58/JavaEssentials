package com.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.config.Config;
import com.aop.dao.AccountDAO;

public class Main {

	public static void main(String[] args) {

		// config dosyasini oku
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// accountDao new'le
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		// fonksiyonu cagir
		accountDAO.addAccount();

		// context kapat
		context.close();
	}
}
