package com.mc_es.CrudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mc_es.CrudDemo.entity.Country;

@Repository
public class CountryDAOHibernate implements CountryDAO {
	private EntityManager entityManager;
	private Session session;

	@Autowired
	public CountryDAOHibernate(EntityManager entityManager) {
		this.entityManager = entityManager;
		this.session = this.entityManager.unwrap(Session.class);
	}

	@Override
	public List<Country> getAllCountries() {
		Query<Country> query = this.session.createQuery("FROM Country", Country.class);

		List<Country> countries = query.getResultList();

		return countries;
	}

	@Override
	public Country getCountryById(int countryId) {
		Country country = this.session.get(Country.class, countryId);

		return country;
	}

	@Override
	public void saveOrUpdateCountry(Country country) {
		this.session.saveOrUpdate(country);
	}

	@Override
	public void deleteCountry(int countryId) {
		Country country = this.session.get(Country.class, countryId);
		this.session.delete(country);

	}

}
