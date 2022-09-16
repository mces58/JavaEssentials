package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class MsSqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("Ms sql eklendi");

	}

}
