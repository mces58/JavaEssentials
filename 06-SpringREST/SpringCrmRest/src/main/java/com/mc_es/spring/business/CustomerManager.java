package com.mc_es.spring.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc_es.spring.dao.CustomerDAO;
import com.mc_es.spring.entity.Customer;

@Service
public class CustomerManager implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Transactional
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Transactional
	@Override
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);

	}

	@Transactional
	@Override
	public Customer getCustomer(int id) {
		return customerDAO.getCustomer(id);
	}

	@Transactional
	@Override
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);

	}

}
