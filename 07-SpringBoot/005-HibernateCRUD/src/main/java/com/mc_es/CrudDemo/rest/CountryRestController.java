package com.mc_es.CrudDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc_es.CrudDemo.business.CountryService;
import com.mc_es.CrudDemo.entity.Country;

@RestController
@RequestMapping(value = "/api")
public class CountryRestController {
	private CountryService countryService;

	@Autowired
	public CountryRestController(CountryService countryService) {
		this.countryService = countryService;
	}

	@GetMapping(value = "/countries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}

	@GetMapping(value = "/countries/{countryId}")
	public Country getCountryById(@PathVariable int countryId) {
		Country country = countryService.getCountryById(countryId);

		if (country == null) {
			throw new RuntimeException("Country id not found: " + countryId);
		}
		return country;
	}

	@PostMapping(value = "/countries")
	public Country saveCountry(@RequestBody Country country) {
		country.setCountryId(0);

		countryService.saveOrUpdateCountry(country);

		return country;
	}

	@PutMapping(value = "/countries")
	public Country updateCountry(@RequestBody Country country) {
		countryService.saveOrUpdateCountry(country);

		return country;
	}

	@DeleteMapping(value = "/countries/{countryId}")
	public String deleteCountry(@PathVariable int countryId) {
		Country country = countryService.getCountryById(countryId);

		if (country == null) {
			throw new RuntimeException("Country id not found: " + countryId);
		}
		countryService.deleteCountry(countryId);

		return "Deleted country id: " + countryId;
	}
}
