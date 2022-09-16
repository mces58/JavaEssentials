package com.spring.dao;

public class MsSqlCustomerDAO implements CustomerDAO {

	private String connectionString;
	private int year;
	private String email;

	public MsSqlCustomerDAO(String connectionString, String year, String email) {
		this.connectionString = connectionString;
		this.year = Integer.valueOf(year);
		this.email = email;
	}

	@Override
	public void insert() {
		System.out.println("Connection string: " + connectionString);
		System.out.println("Year: " + year);
		System.out.println("Email: " + email);
		System.out.println("Ms sql eklendi");
	}

}
