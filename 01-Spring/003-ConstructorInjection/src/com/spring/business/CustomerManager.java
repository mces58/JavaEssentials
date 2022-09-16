package com.spring.business;

import com.spring.dao.CustomerDAO;

public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	// dependency injection
	public CustomerManager(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
