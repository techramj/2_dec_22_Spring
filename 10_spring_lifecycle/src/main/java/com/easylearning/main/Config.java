package com.easylearning.main;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.easylearning.entity.Address;

@ImportResource(value="classpath:spring.xml")
@Import(value = { Config1.class })
@Configuration
public class Config {
	
	@Bean
	public BeanPostProcessor myBPP(){
		return new MyBeanPostProcessor();
	}

	@Bean(initMethod = "init", destroyMethod = "customDestroy")
	public Address address() {
		Address address = new Address();
		address.setCity("Mumbai");
		return address;
	}

}
