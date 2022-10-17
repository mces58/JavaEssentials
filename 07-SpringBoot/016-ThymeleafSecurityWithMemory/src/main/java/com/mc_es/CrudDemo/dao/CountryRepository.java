package com.mc_es.CrudDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	@Query("select c from Country c where c.countryName like ?1")
	public List<Country> findByNameLikeQuery(String countryName);
}
