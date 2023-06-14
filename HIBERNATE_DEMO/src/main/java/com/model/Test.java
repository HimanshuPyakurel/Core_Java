package com.model;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test {
 
	public static void main(String[] args) {
		add();
		getAll();
		update();
		delete();
	}
	
	// add product
	static void add() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Product p = new Product();
		p.setName("nepal");
		p.setCompany("CG");
		p.setPrice(500000);
		
		session.save(p); 					//insert sql
		session.getTransaction().commit(); //sql execute
		session.close();
	}

	static void getAll() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria crt= session.createCriteria(Product.class);
		crt.add(Restrictions.gt("price", 5000));
		crt.add(Restrictions.eq("company", "CG"));
		
		List<Product> plist = crt.list(); // select sql
		
		System.out.println(plist);
	}
	
	static void update() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Product p = (Product)session.get(Product.class, 2);
		p.setPrice(45000);
		p.setCompany("Poco");
		
		session.update(p);
		session.getTransaction().commit();
		session.close();
	}
	
	static void delete() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Product p = (Product)session.get(Product.class, 3);
		
		session.delete(p);
		session.getTransaction().commit();
		session.close();
	}
	
	
}
