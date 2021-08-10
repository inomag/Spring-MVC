package com.spring.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.*;

public class Student {
	
	@NotNull(message="is Required")
	private String firstName;
	
	@NotNull(message="is Required")
	private String lastName;
	
	@Pattern(regexp="^[0-9]{10}",message="Not a valid phone number")
	private String phoneNo;
	
	@Min(value=18, message="Must be greater than 18")
	@Max(value=25, message="Must be less than 25")
	private int age;
	
	
	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getAge() {
		return age;
	}

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
