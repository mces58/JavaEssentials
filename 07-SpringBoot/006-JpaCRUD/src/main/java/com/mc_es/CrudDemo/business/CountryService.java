package com.mc_es.CrudDemo.business;

import java.util.List;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryService {
	public List<Country> getAllCountries();

	public Country getCountryById(int countryId);

	public void saveOrUpdateCountry(Country country);

	public void deleteCountry(int countryId);
}
