package com.easylearing.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String state;
	private String city;
	private String coutry;
	private String zipcode;

	public Address() {
	}
	

	public Address(String state, String city, String coutry, String zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.coutry = coutry;
		this.zipcode = zipcode;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoutry() {
		return coutry;
	}

	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}