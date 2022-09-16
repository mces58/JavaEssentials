package com.spring;

public class CustomerManager {
	// business katmanindan data access katmanina ulastik
	private CustomerDAO customerDAO;

	// dependency injection
	public CustomerManager(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void insert() {
		customerDAO.insert();
	}
}
