package com.mc_es.CrudDemo.dao;

import java.util.List;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryDAO {
	// extra bilgi:
	// https://medium.com/sıfırdan-i̇leri-düzeye-java-eğitim-serisi/jpa-java-persistence-api-ad23bda49931

	public List<Country> getAllCountries();

	public Country getCountryById(int countryId);

	public void saveOrUpdateCountry(Country country);

	public void deleteCountry(int countryId);
}
