package com.mc_es.CrudDemo.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc_es.CrudDemo.dao.CountryRepository;
import com.mc_es.CrudDemo.entity.Country;

@Service
public class CountryManager implements CountryService {
	private CountryRepository countryRepository;

	@Autowired
	public CountryManager(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;

	}

	@Override
	public List<Country> getAllCountries() {
		return countryRepository.findAll();

	}

	@Override
	public Country getCountryById(int countryId) {
		Optional<Country> result = countryRepository.findById(countryId);
		Country country = null;

		if (result.isPresent()) {
			country = result.get();
		} else {
			throw new RuntimeException("Did not found country id: " + countryId);
		}

		return country;

	}

	@Override
	public void saveOrUpdateCountry(Country country) {
		countryRepository.save(country);

	}

	@Override
	public void deleteCountry(int countryId) {
		countryRepository.deleteById(countryId);

	}

	@Override
	public List<Country> findByContinent(String continent) {
		return countryRepository.findByContinent(continent);
	}

	@Override
	public List<Country> findByOrderByCountryCodeDesc() {
		List<Country> countries = countryRepository.findByOrderByCountryCodeDesc();

		return countries;
	}

}
