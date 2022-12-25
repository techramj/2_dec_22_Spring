package com.easylearning.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easylearning.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
