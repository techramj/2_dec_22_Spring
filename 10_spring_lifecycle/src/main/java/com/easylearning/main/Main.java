package com.easylearning.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Address;
import com.easylearning.entity.SampleBean;
import com.easylearning.entity.TicketVendorMachine;

public class Main {
	
	public static void main(String[] args) {
		classConfigExample4();
	}
	
	public static void classConfigExample4() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigNew.class);
		System.out.println();
      
		System.out.println("ready to use the bean");
		TicketVendorMachine machine1 = context.getBean("machine", TicketVendorMachine.class);
		TicketVendorMachine machine2 = context.getBean("machine", TicketVendorMachine.class);
		
		System.out.println(machine1 == machine2);
		System.out.println(machine1.getTicket() == machine2.getTicket());
		System.out.println(machine1.getTicket());
		System.out.println(machine2.getTicket());
		((ConfigurableApplicationContext)context).close();
	}
	
	
	public static void xmlExample5() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("ready to use the bean");
		TicketVendorMachine machine1 = context.getBean("machine", TicketVendorMachine.class);
		TicketVendorMachine machine2 = context.getBean("machine", TicketVendorMachine.class);
		
		System.out.println(machine1 == machine2);
		System.out.println(machine1.getTicket() == machine2.getTicket());
		System.out.println(machine1.getTicket());
		System.out.println(machine2.getTicket());
		((ConfigurableApplicationContext)context).close();
	}
	
	
	public static void xmlExample4() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("ready to use the bean");
		SampleBean bean = context.getBean("sampleBean", SampleBean.class);
		try {
			bean.readResource();
		} catch (IOException e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext)context).close();
	}
	
	public static void xmlExample3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("ready to use the bean");

		((ConfigurableApplicationContext)context).close();
	}
	
	public static void classConfigExample3() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println();
        
		Address bean3 = context.getBean("address2",Address.class);
		System.out.println("ready to use the bean");
	
		System.out.println();
		
		((ConfigurableApplicationContext)context).close();
	}
	
	public static void classConfigExample2() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println();
		
		Address bean1 = context.getBean("address",Address.class);
		Address bean2 = context.getBean("address1",Address.class);
		
		
		System.out.println("ready to use the bean");
		System.out.println("bean1="+bean1);
		System.out.println("bean1="+bean2);
		System.out.println();
		
		((ConfigurableApplicationContext)context).close();
	}
	
	public static void classConfigExample1() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class, Config.class);
		Address bean1 = context.getBean("address",Address.class);
		Address bean2 = context.getBean("address1",Address.class);
		System.out.println("ready to use the bean");
		System.out.println("bean1="+bean1);
		System.out.println("bean1="+bean2);
		((ConfigurableApplicationContext)context).close();
	}
	
	public static void xmlExample2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Address bean1 = context.getBean("address",Address.class);
		Address bean2 = context.getBean("address1",Address.class);
		System.out.println("ready to use the bean");
		System.out.println("bean1="+bean1);
		System.out.println("bean1="+bean2);
		((ConfigurableApplicationContext)context).close();
	}
	
	public static void xmlExample1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml","config1.xml");
		Address bean1 = context.getBean("address",Address.class);
		Address bean2 = context.getBean("address1",Address.class);
		System.out.println("ready to use the bean");
		System.out.println("bean1="+bean1);
		System.out.println("bean1="+bean2);
		((ConfigurableApplicationContext)context).close();
	}

}
