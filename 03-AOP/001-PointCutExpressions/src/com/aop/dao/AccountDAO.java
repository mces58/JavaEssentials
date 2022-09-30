package com.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("Veri tabanina yeni hesap ekle. " + getClass());
	}
}
