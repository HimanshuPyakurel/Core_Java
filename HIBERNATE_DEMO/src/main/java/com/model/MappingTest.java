package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {

	public static void main(String[] args) {
		
		oneToOne();
	}
	
	//OneToOne
	static void oneToOne() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Car c = new Car();
		c.setColor("Red");
		c.setCompany("Tesla");
		c.setPrice(4000000);
		
		session.save(c);
		
		Employee emp = new Employee();
		emp.setFname("Himanshu");
		emp.setLname("Pyakurel");
		emp.setSalary(10000000);
		emp.setCar(c);
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}

}

