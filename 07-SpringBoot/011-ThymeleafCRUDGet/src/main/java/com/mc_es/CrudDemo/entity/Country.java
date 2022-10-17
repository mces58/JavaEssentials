package com.mc_es.CrudDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Country_id")
	private int countryId;

	@Column(name = "Country_code")
	private String countryCode;

	@Column(name = "Country_name")
	private String countryName;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Region")
	private String region;

	@Column(name = "Population")
	private int population;

	@Column(name = "Surface_area")
	private double surfaceArea;

	@Column(name = "Government_form")
	private String governmentForm;
}
