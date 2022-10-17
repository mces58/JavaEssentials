package com.mc_es.CrudDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mc_es.CrudDemo.business.CountryService;
import com.mc_es.CrudDemo.entity.Country;

@Controller
@RequestMapping(value = "/countries")
public class CountryController {
	private CountryService countryService;

	@Autowired
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@GetMapping(value = "/findAll")
	public String listCountries(Model model) {

		List<Country> countries = this.countryService.findAll();

		model.addAttribute("countries", countries);

		return "get/list-countries";
	}

	@GetMapping(value = "/formForAdd")
	public String formForAdd(Model model) {
		Country country = new Country();

		model.addAttribute("country", country);

		return "add/country-form";
	}

	@PostMapping(value = "/save")
	public String saveCountry(@ModelAttribute(value = "country") Country country) {

		this.countryService.save(country);

		return "redirect:/countries/findAll";

	}
}
