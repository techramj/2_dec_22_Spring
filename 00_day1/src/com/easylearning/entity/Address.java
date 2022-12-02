package com.easylearning.entity;

public class Address {
	private String city;
	private Street street;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address(String city, Street street) {
		super();
		this.city = city;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

}
