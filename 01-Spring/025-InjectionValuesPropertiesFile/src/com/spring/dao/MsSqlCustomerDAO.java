package com.spring.dao;

import org.springframework.beans.factory.annotation.Value;

public class MsSqlCustomerDAO implements CustomerDAO {
	@Value(value = "${can.connectionString}")
	private String connectionString;
	// xml'de yaptigimiz gibi bu field'lara deger atayabilmemiz icin
	// value anatasyonunu kullaniyoruz

	@Value(value = "${can.year}")
	private int year;

	@Value(value = "${can.email}")
	private String email;

	// aslinda getter & settera gerek yok zaten degerleri
	// values.properties dosyasindan aliyoruz

	@Override
	public void insert() {
		System.out.println("Connection string: " + connectionString);
		System.out.println("Year: " + year);
		System.out.println("Email: " + email);
		System.out.println("Ms sql eklendi");
	}

}
