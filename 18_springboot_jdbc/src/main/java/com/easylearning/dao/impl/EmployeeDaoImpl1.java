package com.easylearning.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.entity.Employee;

@Primary
@Repository
@Transactional
public class EmployeeDaoImpl1 implements EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
		
		TypedQuery<Employee> namedQuery = entityManager.createNamedQuery("all_emp", Employee.class);
		return namedQuery.getResultList();
	}

	@Override
	public Employee save(Employee emp) {
		return entityManager.merge(emp);
	}

	@Override
	public Employee update(Employee emp) {
		return entityManager.merge(emp);
	}

	@Override
	public void delete(Employee emp) {
		entityManager.remove(emp);
	}
	
}
