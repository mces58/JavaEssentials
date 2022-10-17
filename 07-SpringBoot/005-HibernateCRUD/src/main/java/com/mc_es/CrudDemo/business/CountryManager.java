package com.mc_es.CrudDemo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mc_es.CrudDemo.dao.CountryDAO;
import com.mc_es.CrudDemo.entity.Country;

@Service
public class CountryManager implements CountryService {
	private CountryDAO countryDAO;

	@Autowired
	public CountryManager(CountryDAO countryDAO) {
		this.countryDAO = countryDAO;

	}

	@Transactional
	@Override
	public List<Country> getAllCountries() {
		return countryDAO.getAllCountries();

	}

	@Transactional
	@Override
	public Country getCountryById(int countryId) {
		return countryDAO.getCountryById(countryId);

	}

	@Transactional
	@Override
	public void saveOrUpdateCountry(Country country) {
		countryDAO.saveOrUpdateCountry(country);

	}

	@Transactional
	@Override
	public void deleteCountry(int countryId) {
		countryDAO.deleteCountry(countryId);
	}

}
