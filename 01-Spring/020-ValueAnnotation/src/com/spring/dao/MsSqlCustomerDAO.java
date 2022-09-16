package com.spring.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MsSqlCustomerDAO implements CustomerDAO {
	@Value("${can.connectionString}")
	private String connectionString;

	@Value("${can.year}")
	private int year;

	@Override
	public void insert() {
		System.out.println("Connection string: " + connectionString);
		System.out.println("Year: " + year);
		System.out.println("Ms sql eklendi");

	}

}
