package com.mc_es.spring.dao;

import java.util.List;

import com.mc_es.spring.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
