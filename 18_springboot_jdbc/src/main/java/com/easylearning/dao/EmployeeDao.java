package com.easylearning.dao;

import java.util.List;

import com.easylearning.entity.Employee;

public interface EmployeeDao {

	public Employee findById(int id);

	public List<Employee> findAll();

	public Employee save(Employee emp);

	public Employee update(Employee emp);

	public void delete(Employee emp);

}
