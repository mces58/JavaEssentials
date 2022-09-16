package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.dao.CustomerDAO;

@Component
public class CustomerManager implements CustomerService {
	@Autowired
	@Qualifier(value = "msSqlCustomerDAO")
	private CustomerDAO customerDAO;
	// field'in ustune yazarak enjekte edebiliriz

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
