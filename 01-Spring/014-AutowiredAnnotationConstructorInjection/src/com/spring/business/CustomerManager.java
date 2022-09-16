package com.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dao.CustomerDAO;

@Component
public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	// @Autowired anotasyonu sayesinde bir bean içerisindeki değerleri başka
	// beanin içerisine enjekte edebilir değerlerini koruyarak kullanabiliriz.
	// @Autowired anotasyonunu bir değişken, setter ya da constructor metot
	// üzerinde kullanılabilmekteyiz
	@Autowired
	public CustomerManager(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
