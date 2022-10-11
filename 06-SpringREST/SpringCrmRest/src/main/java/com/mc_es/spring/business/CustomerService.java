package com.mc_es.spring.business;

import java.util.List;

import com.mc_es.spring.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
