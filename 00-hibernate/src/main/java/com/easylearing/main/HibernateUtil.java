package com.easylearing.main;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.easylearing.entities.Employee;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		Configuration configuration=new Configuration();
		configuration.addAnnotatedClass(Employee.class);
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());

	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
