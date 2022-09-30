package com.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;
	private int accountCode;

	public void addAccount() {
		System.out.println("Veri tabanina yeni hesap ekle. " + getClass());
	}

	public String getName() {
		System.out.println("getName() -- " + getClass());
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() -- " + getClass());
		this.name = name;
	}

	public int getAccountCode() {
		System.out.println("getAccountCode() -- " + getClass());
		return accountCode;
	}

	public void setAccountCode(int accountCode) {
		System.out.println("setAccountCode() -- " + getClass());
		this.accountCode = accountCode;
	}

}
