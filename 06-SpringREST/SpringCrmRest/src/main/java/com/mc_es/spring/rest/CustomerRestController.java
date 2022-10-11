package com.mc_es.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc_es.spring.business.CustomerService;
import com.mc_es.spring.entity.Customer;
import com.mc_es.spring.error.CustomerNotFound;

@RestController
@RequestMapping(value = "/api")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	// 9999 gibi id degeri donderirsek server bize null degeri veya empty olarak
	// donus yapar bunu engellemek icin hata attiriyoruz

	@GetMapping(value = "/customers/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer customer = customerService.getCustomer(customerId);

		if (customer == null) {
			throw new CustomerNotFound("Customer id not found: " + customerId);
		}
		return customer;
	}

	@PostMapping(value = "/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		customer.setId(0); // saveOrUpdate yaptigimiz icin id degerini vererek yeni customer insert yapar
		customerService.saveCustomer(customer);
		return customer;
	}

	@PutMapping(value = "/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);

		return customer;
	}

	@DeleteMapping(value = "/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		Customer customer = customerService.getCustomer(customerId);

		if (customer == null) {
			throw new CustomerNotFound("Customer id not found: " + customerId);
		}
		customerService.deleteCustomer(customerId);

		return "Deleted customer id: " + customerId;
	}
}
