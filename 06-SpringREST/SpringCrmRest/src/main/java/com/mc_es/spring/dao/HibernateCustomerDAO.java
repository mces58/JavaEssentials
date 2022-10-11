package com.mc_es.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mc_es.spring.entity.Customer;

@Repository
public class HibernateCustomerDAO implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);

		List<Customer> customers = query.getResultList();

		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);

	}

	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();

		Customer customer = session.get(Customer.class, id);

		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();

//		Query<?> query = session.createQuery("delete from Customer where id =: customerId");
//		query.setParameter("customerId", id);
//		query.executeUpdate();

		Customer customer = session.get(Customer.class, id);

		if (customer != null) {
			session.delete(customer);
		} else {
			return;
		}

	}

}
