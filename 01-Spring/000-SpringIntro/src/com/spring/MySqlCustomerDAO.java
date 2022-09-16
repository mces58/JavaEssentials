package com.spring;

public class MySqlCustomerDAO implements CustomerDAO {
	// mysql'e ait kodlarin yazildigi yer
	// burada veri tabanina ekleme islemlerinin yapildigi farz edilsin

	@Override
	public void insert() {
		System.out.println("My Sql veri tabanina eklendi");
	}

}
