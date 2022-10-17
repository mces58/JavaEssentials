package com.mc_es.CrudDemo.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String saveCountry(@ModelAttribute(value = "country") @Valid Country country, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "add/country-form";
		} else {
			this.countryService.save(country);

			return "redirect:/countries/findAll";
		}
	}

	@GetMapping(value = "/formForUpdate")
	public String formForUpdate(@RequestParam(value = "countryId") int countryId, Model model) {

		Country country = this.countryService.findById(countryId);

		model.addAttribute("country", country);

		return "update/country-form";
	}

	@GetMapping(value = "/delete")
	public String delete(@RequestParam(value = "countryId") int countryId) {
		this.countryService.deleteById(countryId);

		return "redirect:/countries/findAll";
	}

	@GetMapping(value = "/search")
	public String search(@RequestParam(value = "countryName") String countryName, Model model) {

		if (countryName.trim().isEmpty()) {
			return "redirect:/countries/findAll";
		} else {
			List<Country> countries = this.countryService.findByNameLikeQuery(countryName);

			model.addAttribute("countries", countries);

			return "get/list-countries";

		}
	}
}
