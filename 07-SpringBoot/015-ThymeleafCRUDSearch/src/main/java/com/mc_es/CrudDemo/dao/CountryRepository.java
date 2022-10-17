package com.mc_es.CrudDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	public List<Country> findByCountryNameContainsAllIgnoreCase(String countryName);
}
