package com.easylearning.main;

import com.easylearning.entity.Address;
import com.easylearning.entity.Employee;
import com.easylearning.entity.LandMark;
import com.easylearning.entity.Street;

public class Main {
	
	public static void main(String[] args) {
		LandMark lm1 = new LandMark("mg road");
		Street street1 = new Street(1, "Lane 1", lm1, "411021");
		Address address1 = new Address("pune",street1);
		Employee emp1 = new Employee(1, "jack", 1000, address1);
	
		
		
		LandMark lm2 = new LandMark();
		lm2.setName("Subhaash chandra bose road");
		
		Street street2 = new Street();
		street2.setLaneNo(2);
		street2.setName("ABC Square");
		street2.setLandmark(lm2);
		street2.setPinCode("4111011");
		
		Address address2 = new Address("Mumbai");
		address2.setStreet(street2);
		
		Employee emp = new Employee(2, "John", 2000);
		emp.setAddress(address2);
		
		LandMark lm3 = new LandMark();
		Street st3 = new Street();
		Address address3 = new Address();
		Employee emp3 = new Employee();
		
		
	}

}
