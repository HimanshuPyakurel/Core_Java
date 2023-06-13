package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
 
	public static void main(String[] args) {
		add();
	}
	
	// add product
	static void add() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Product p = new Product();
		p.setName("Tv");
		p.setCompany("Samsung");
		p.setPrice(50000);
		
		session.save(p); 					//insert sql
		session.getTransaction().commit(); //sql execute
		session.close();
	}
	
}
