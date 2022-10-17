package com.mc_es.CrudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mc_es.CrudDemo.entity.Country;

// extra bilgi:
// https://medium.com/sıfırdan-i̇leri-düzeye-java-eğitim-serisi/jpa-java-persistence-api-ad23bda49931

@Repository
public class CountryDAOJpa implements CountryDAO {
	private EntityManager entityManager;

	@Autowired
	public CountryDAOJpa(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Country> getAllCountries() {
		TypedQuery<Country> query = entityManager.createQuery("from Country", Country.class);
		List<Country> countries = query.getResultList();

		return countries;
	}

	@Override
	public Country getCountryById(int countryId) {
		Country country = entityManager.find(Country.class, countryId);

		return country;
	}

	@Override
	public void saveOrUpdateCountry(Country country) {
		Country dbCountry = entityManager.merge(country);

		country.setCountryId(dbCountry.getCountryId());

	}

	@Override
	public void deleteCountry(int countryId) {
		Country country = entityManager.find(Country.class, countryId);

		entityManager.remove(country);

	}

}
