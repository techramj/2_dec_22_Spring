package com.easylearning.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easylearning.entity.Address;

@Configuration
public class Demo1Coniguration {
	
	@Bean
	public Address add2() {
		Address address = new Address();
		address.setCity("Nashik");
		address.setPinCode("222333");
		return address;
	}

}
