package com.easylearning.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easylearning.dao.impl.EmployeeRepository;
import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> findById = repository.findById(id);
		return findById.get();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return repository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return repository.save(emp);
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee emp = getEmployee(id);
		repository.delete(emp);
		return emp;
	}

}
