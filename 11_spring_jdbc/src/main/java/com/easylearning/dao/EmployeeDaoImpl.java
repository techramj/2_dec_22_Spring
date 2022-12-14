package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.easylearning.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;

	public void save(Employee emp) {
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try (PreparedStatement ps = con.prepareStatement(SQL_INSERT_EMP)) {
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll() {
		List<Employee> empList = new ArrayList<>();
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try (Statement st = con.createStatement()) {
			
			try (ResultSet rs = st.executeQuery(SQl_ALL_EMP)) {
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					double salary = rs.getDouble(3);
					Employee emp = new Employee(id, name, salary);
					empList.add(emp);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
