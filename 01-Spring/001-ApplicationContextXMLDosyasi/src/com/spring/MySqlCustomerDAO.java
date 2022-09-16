package com.spring;

public class MySqlCustomerDAO implements CustomerDAO {
	// my sql insert isleminin kodlari yazilir

	@Override
	public void insert() {
		System.out.println("My sql eklendi");

	}

}
