package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dao.CustomerDAO;

@Component
public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	@Autowired
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
