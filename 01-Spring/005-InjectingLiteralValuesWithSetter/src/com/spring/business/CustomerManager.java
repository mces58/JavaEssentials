package com.spring.business;

import com.spring.dao.CustomerDAO;

public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {// setter injection
		this.customerDAO = customerDAO;
	}

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
