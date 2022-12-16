package com.easylearning.dao;

import java.util.List;

import com.easylearning.entity.Employee;

public interface EmployeeDao {

	String SQL_INSERT_EMP = "insert into emp(id,name,salary) values (?,?,?)";
	String SQL_UPDATE_EMP = "update emp set salary= ?, name= ? where id =?";
	String SQL_DELETE = "delete from emp where id = ?";
	String SQl_ALL_EMP = "select * from emp";
	String SQL_EMP_BY_ID = "select * from emp where id =?";
	String SQL_EMP_BY_NAME = "select * from emp where name =?";

	void save(Employee emp);

	void update(Employee emp);

	void delete(int id);

	Employee findById(int id);

	List<Employee> findAll();

}
