package com.spring.business;

import com.spring.dao.CustomerDAO;

public class CustomerManager implements CustomerService {
	private CustomerDAO customerDAO;

	// dependency injection
	public void setCustomerDAO(CustomerDAO customerDAO) { // setter
		this.customerDAO = customerDAO;
	}
	/*
	 * onemli noktalardan biri sudur: burada setCustomerDAO adida metodu olusturduk
	 * ve xml dosyasinda property'nin name ozelligine de bu adi ayni sekilde
	 * gondermek zorundayiz. Yani setCustomerDAO ise name="customerDAO" 
	 * kisacasi xml dosyasindaki name ozelligi ile metotun adi ayni olmalidir
	 * bastaki set ifadesi olmadan
	 */

	@Override
	public void insert() {
		customerDAO.insert();

	}

}
