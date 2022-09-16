package com.spring.business;

import com.spring.dao.CustomerDAO;

public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	public CustomerManager(CustomerDAO customerDAO) {// constructor injection
		this.customerDAO = customerDAO;
	}

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
