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
	public List<Country> findAll() {

		return this.countryRepository.findAll();
	}

	@Override
	public Country findById(int id) {
		Optional<Country> result = countryRepository.findById(id);
		Country country = null;

		if (result.isPresent()) {
			country = result.get();
		} else {
			throw new RuntimeException("Did not found country id: " + id);
		}
		return country;
	}

	@Override
	public void save(Country country) {
		this.countryRepository.save(country);

	}

	@Override
	public void deleteById(int id) {
		this.countryRepository.deleteById(id);

	}

	@Override
	public List<Country> searchBy(String countryName) {
		List<Country> results = null;

		if (countryName != null && countryName.trim().length() > 0) {
			results = this.countryRepository.findByCountryNameContainsAllIgnoreCase(countryName);
		} else {
			results = findAll();
		}
		return results;

	}

}
