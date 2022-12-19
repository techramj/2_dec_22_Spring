package com.easylearning.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.entity.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
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

	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public Employee getEmployee(int id) {
		return empDao.findById(id);
	}

	public List<Employee> getEmployee(String name) {
		List<Employee> list = empDao.findAll();
		return list.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	@Override
	@Transactional
	public void transfer(int fromId, int toId, double amount) {
		incrementSalary(fromId, -amount);
		incrementSalary(toId, amount);
	}

	@Transactional
	public void transfer1(int fromId, int toId, double amount) {

		Employee from = getEmployee(fromId);
		Employee to = getEmployee(toId);

		from.setSalary(from.getSalary() - amount);
		update(from);
		if (1 == 2) {
			throw new NullPointerException("force exception!!!!");
		}

		to.setSalary(to.getSalary() + amount);
		update(to);
	}

	public void incrementSalary(int id, double amount) {
		Employee emp = getEmployee(id);
		emp.setSalary(emp.getSalary() + amount);
		update(emp);
	}

	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

}
