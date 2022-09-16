package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.dao.CustomerDAO;

@Component
public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	@Autowired
	@Qualifier(value = "mySqlCustomerDAO")
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	/*
	 * burada constructor injection'dan farki olarak burada anatasyon parametre
	 * olarak degil normal sekilde fonksiyonunun ustune yazilir
	 */

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
