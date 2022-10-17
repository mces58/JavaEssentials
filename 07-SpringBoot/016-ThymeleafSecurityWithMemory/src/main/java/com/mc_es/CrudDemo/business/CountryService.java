package com.mc_es.CrudDemo.business;

import java.util.List;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryService {
	public List<Country> findAll();

	public Country findById(int id);

	public void save(Country country);

	public void deleteById(int id);

	public List<Country> findByNameLikeQuery(String countryName);
}
