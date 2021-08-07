package com.spring.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="Cannot be Empty")
	private String firstName;
	
	@Size(min=3,message="Must be larger than 3")
	private String lastName;
	private String country;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private String language,secondaryLanguage;
	
	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getSecondaryLanguage() {
		return secondaryLanguage;
	}


	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}


	public Student() {
		
		// populate country options
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("Germany", "Germany");
		countryOptions.put("France", "France");
		countryOptions.put("India", "India");
		countryOptions.put("Australia", "Australia");
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
