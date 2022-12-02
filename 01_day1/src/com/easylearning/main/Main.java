package com.easylearning.main;

import com.easylearning.entity.Bike;
import com.easylearning.entity.Car;
import com.easylearning.entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		Bike bike1 = new Bike("Pulsar");
		Car car1 = new Car();
		Employee emp1 = new Employee(1, "jack", bike1);
		
		
		Bike bike2 = new Bike("KTM");
		Employee emp2 = new Employee(2, "jackie");
	    emp2.setVehicle(bike2);
	}

}
