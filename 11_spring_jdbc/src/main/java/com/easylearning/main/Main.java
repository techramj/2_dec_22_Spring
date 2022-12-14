package com.easylearning.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.dao.EmployeeDaoImpl;
import com.easylearning.entity.Address;
import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeService;
import com.easylearning.service.EmployeeServiceImpl;

public class Main {

	public static void main(String...args) {
		springXmlBasedDemo1();
		
	}
	
	public static void springXmlBasedDemo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService empService = context.getBean("empService", EmployeeServiceImpl.class);
		List<Employee> empList = empService.getEmployees();
	
		empList.forEach(System.out::println);
		
		System.out.println("udpating the salalry of id 6 from 5 thousand to 6 thousand");
		Employee emp1 = empService.getEmployee(6);
		emp1.setSalary(25000);
		empService.update(emp1);
		
		
		System.out.println("\ndeleting id 100");
		empService.delete(100);
		
		
		System.out.println("\nemplist...........");
		empService.getEmployees().forEach(e-> System.out.println(e));
	}

	public static void springXmlBasedDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao empDao= context.getBean("empDao",EmployeeDaoImpl.class);
		List<Employee> emp = empDao.findAll();
		emp.forEach(System.out::println);
	}

	public static void annotationBasedDemo() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo1Coniguration.class);
		Address address = context.getBean("add2", Address.class);
		System.out.println(address);
	}
	
	

}
