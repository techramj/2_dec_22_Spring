package com.easylearning.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easylearning.entity.Address;
import com.easylearning.entity.Street;

@Configuration
public class Config {
	
	@Bean
	public Street street() {
		Street street = new Street("123","Bose road");
		return street;
	}
	
	@Bean
	public Address address(Street street) {
		Address address = new Address();
		address.setCity("PUne");
		address.setPinCode("123455");
		address.setStreet(street);
		return address;
	}
	
	@Bean
	@Autowired
	public Address address1(@Autowired Street street) {
		Address address = new Address();
		address.setCity("Mumbai");
		address.setPinCode("123455");
		address.setStreet(street);
		return address;
	}

}
