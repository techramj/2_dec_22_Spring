package com.easylearing.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.easylearing.entities.Address;
import com.easylearing.entities.Employee;

public class ApplicationMain {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Employee emp=new Employee(1111,"Ram",90000);
		Address address=new Address("Maharastra", "Pune", "Ind", "MH12");
		emp.setAddress(address);
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
