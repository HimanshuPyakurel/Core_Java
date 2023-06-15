package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {

	public static void main(String[] args) {
		
		oneToOne();
		oneToMany();
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
	
	static void oneToMany() {
		
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
		
		Phone p1=new Phone();
		p1.setNumber("9032361253");
		p1.setType("NCELL");
		p1.setEmployee(emp);
		session.save(p1);
		
		Phone p2=new Phone();
		p2.setNumber("98356512");
		p2.setType("NTC");
		p2.setEmployee(emp);
		session.save(p2);
		
		emp.setPhoneList(Arrays.asList(p1,p2));
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		
	}

}

