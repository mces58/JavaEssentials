package com.spring;

import org.springframework.stereotype.Component;

@Component
//My sql ile calismak istiyorsan companent'i onun basina yazman gerek
public class MySqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("My Sql eklendi");

	}

}
