package com.easylearning.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean {

	private String city;

	public Address() {
		System.out.println("Address: Default constructor called!!!");
	}

	public Address(String city) {
		System.out.println("Address: Paramterized constructor called!!!");
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Address: setter called ");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Address:  destroy!!!");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Adress:  afterPropertiesSet init");	
	}
	
	public void init() {
		System.out.println("Address: custom init!!!!");
	}
	
	public void customDestroy() {
		System.out.println("Address: custom Destroy method");
	}

}
