package com.easylearning.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee findById(int id) {
		return new Employee(id, "Jack", 5555.0);
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("select * from emp", new EmployeeRowMapper());
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
	
	class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
		}
		
	}

}
