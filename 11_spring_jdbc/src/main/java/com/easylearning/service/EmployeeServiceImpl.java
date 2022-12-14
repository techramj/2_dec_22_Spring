package com.easylearning.service;

import java.util.List;
import java.util.stream.Collectors;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.entity.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao;

	public void createEmployee(Employee emp) {
		empDao.save(emp);
		System.out.println("Data added!!!!");
	}

	public void delete(int id) {
		empDao.delete(id);
		System.out.println("deleted!!!!");
	}

	public void update(Employee emp) {
		empDao.update(emp);
		System.out.println("updated!!!!");
	}

	public boolean isEmployeeExist(Employee emp) {
		if (empDao.findById(emp.getId()) != null) {
			return true;
		}
		return false;
	}

	public List<Employee> getEmployees() {
		return empDao.findAll();
	}

	public Employee getEmployee(int id) {
		return empDao.findById(id);
	}

	public List<Employee> getEmployee(String name) {
		List<Employee> list = empDao.findAll();
		return list.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

}
