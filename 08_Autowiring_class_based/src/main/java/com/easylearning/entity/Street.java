package com.easylearning.entity;

import org.springframework.stereotype.Component;

@Component
public class Street {

	private String streetNumber;
	private String name;

	public Street() {
		// TODO Auto-generated constructor stub
	}

	public Street(String streetNumber, String name) {
		super();
		this.streetNumber = streetNumber;
		this.name = name;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Street [streetNumber=" + streetNumber + ", name=" + name + "]";
	}

}
