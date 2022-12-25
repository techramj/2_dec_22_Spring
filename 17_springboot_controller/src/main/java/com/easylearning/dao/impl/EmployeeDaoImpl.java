package com.easylearning.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.dao.mapper.EmployeeMapper;
import com.easylearning.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeMapper empMapper;

	@Override
	public Employee findById(int id) {
		return new Employee(id, "Jack", 5555.0);
	}

	@Override
	public List<Employee> findAll() {
		/*return jdbcTemplate.query("select * from emp", 
		      new BeanPropertyRowMapper<Employee>(Employee.class)); */
		return jdbcTemplate.query("select * from emp", empMapper);
	}

	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
}
