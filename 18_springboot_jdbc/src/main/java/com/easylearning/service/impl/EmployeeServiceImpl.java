package com.easylearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmployees() {
		return empDao.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		return empDao.findById(id);
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return empDao.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return empDao.update(emp);
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee emp = getEmployee(id);
		empDao.delete(emp);
		return emp;
	}

}
