package com.easylearning.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.easylearning.entity.Employee;

@Component
public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setFirstName(rs.getString("firstname"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
