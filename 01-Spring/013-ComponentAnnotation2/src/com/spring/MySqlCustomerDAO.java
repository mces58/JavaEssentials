package com.spring;

public class MySqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("My sql eklendi");

	}

}
