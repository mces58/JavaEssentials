package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dao.CustomerDAO;

@Component
public class CustomerManager implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
