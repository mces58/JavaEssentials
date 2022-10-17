package com.mc_es.CrudDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
