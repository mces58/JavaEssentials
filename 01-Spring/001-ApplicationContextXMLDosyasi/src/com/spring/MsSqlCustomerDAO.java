package com.spring;

public class MsSqlCustomerDAO implements CustomerDAO {
	// ms sql insert isleminin kodlari yazilir.

	@Override
	public void insert() {
		System.out.println("Ms sql eklendi");
	}

}
