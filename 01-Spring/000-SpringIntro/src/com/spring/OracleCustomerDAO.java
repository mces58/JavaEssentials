package com.spring;

public class OracleCustomerDAO implements CustomerDAO {
	// oracle'a ait kodlarin yazildigi yer
	// burada veri tabanina ekleme islemlerinin yapildigi farz edilsin

	@Override
	public void insert() {
		System.out.println("Oracle veri tabanina eklendi");
	}

}
