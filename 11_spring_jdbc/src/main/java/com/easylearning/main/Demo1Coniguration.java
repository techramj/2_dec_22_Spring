package com.easylearning.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521/ORCLPDB");
		ds.setUsername("hr");
		ds.setPassword("hr");
		return ds;
	}

}
