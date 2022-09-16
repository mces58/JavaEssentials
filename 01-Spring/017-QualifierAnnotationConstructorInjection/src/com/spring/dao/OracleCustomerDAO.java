package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class OracleCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("Oracle eklendi");

	}

}
