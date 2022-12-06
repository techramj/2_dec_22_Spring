package com.easylearning.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String pinCode;
	
	@Autowired
	private Street street;

	public Address() {
		System.out.println("default address constructor called...");
	}

	public Address(String city, String pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + ", street=" + street + "]";
	}

}
