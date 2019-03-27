package org.practice.spring;

import javax.validation.constraints.Size;

public class Information {
	@Size(min=3 ,max=8)
	private String firstName;
		private String lastName,gender;
	private String country,text,visit[];

	public String[] getVisit() {
		return visit;
	}

	public void setVisit(String[] visit) {
		this.visit = visit;
	}

	public String getText() {
		return text;
	}

	public void setText(String txet) {
		this.text = txet;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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