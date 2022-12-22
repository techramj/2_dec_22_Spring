package com.easylearning.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/greet")
	public String greet() {
		return "Very Good morning";
	}
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		List<Employee> empList = empService.getAllEmployees();
		logger.info("Employee list => {}", empList);
		return empList;
	}
	
	@GetMapping("/emp")
	public Employee getEmp(@RequestParam("id") int id) {
		logger.info("Id="+id);
		return empService.getEmployee(id);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		logger.info("Id="+id);
		return empService.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		logger.info("emp ={}", emp);
		emp.setId(10001);
		return emp;
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		logger.info("emp ={}", emp);
		return emp;
	}
	
	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		logger.info("Id to be deleted="+id);
		return empService.getEmployee(id);
	}

}
