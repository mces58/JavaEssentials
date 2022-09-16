package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class MySqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("My sql eklendi");

	}

}
