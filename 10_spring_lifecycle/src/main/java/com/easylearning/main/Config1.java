package com.easylearning.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easylearning.entity.Address;

@Configuration
public class Config1 {
	
	@Bean(initMethod = "init", destroyMethod = "customDestroy" )
	public Address address1() {
		Address address = new Address("Mumbai");
		return address;
	}
	

}
