package com.easylearning.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.easylearning.entity.Bike;
import com.easylearning.entity.Car;
import com.easylearning.entity.Employee;
import com.easylearning.entity.Jeep;
import com.easylearning.entity.Vehicle;

@Configuration
public class Config {
	
	@Bean
	public Vehicle bike() {
		return new Bike("Pulsar");
	}
	
	@Primary
	@Bean
	public Vehicle car() {
		return new Car("BMW");
	}
	
	@Bean
	public Vehicle jeep() {
		return new Jeep("Mahindra Thar");
	}
	
	@Bean
	public Employee emp() {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Deepak");
		emp.setSalary(5000.0);
		emp.setVehicle(bike());
		return emp;
	}
	
	@Bean
	public Employee emp1(@Autowired  @Qualifier(value="jeep") Vehicle vehicle) {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Deepak");
		emp.setSalary(5000.0);
		emp.setVehicle(vehicle);
		return emp;
	}
	
	@Bean
	public Employee emp2(@Autowired Vehicle vehicle) {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Deepak");
		emp.setSalary(5000.0);
		emp.setVehicle(vehicle);
		return emp;
	}


}
