package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Address;
import com.easylearning.entity.Bike;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("_______________________________________________________\n\n");
		
		Address add1 = context.getBean("address1",Address.class);
		Address add2 = context.getBean("address1",Address.class);

		boolean flag1 = add1 == add2;
		System.out.println("add1==add2:      "+flag1);
		
		Bike bike1 = context.getBean("bike",Bike.class);
		Bike bike2 = context.getBean("bike",Bike.class);
		flag1= bike1 == bike2;
		System.out.println("bike1==bike2:     "+flag1);
		System.out.println("____________________________________________________________");
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
