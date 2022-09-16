package com.spring;

import org.springframework.stereotype.Component;

@Component
//Ms sql ile calismak istiyorsan companent'i onun basina yazman gerek
public class MsSqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("Ms Sql eklendi");

	}

}
