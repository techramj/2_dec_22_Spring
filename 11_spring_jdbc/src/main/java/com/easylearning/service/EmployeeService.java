package com.easylearning.service;

import java.util.List;

import com.easylearning.entity.Employee;

public interface EmployeeService {

	void createEmployee(Employee emp);

	void delete(int id);

	void update(Employee emp);

	boolean isEmployeeExist(Employee emp);

	List<Employee> getEmployees();

	Employee getEmployee(int id);

	List<Employee> getEmployee(String name);

}
