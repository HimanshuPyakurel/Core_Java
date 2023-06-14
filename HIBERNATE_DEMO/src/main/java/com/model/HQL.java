package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL {
	public static void main(String[] args) {
		getAllUsingHQL();
		
	}

	//HQl -> Hibernate Query Language
	
	static void getAllUsingHQL() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Query hql = session.createQuery("From Product");
		List<Product> plist = hql.list(); // select sql
		
		System.out.println(plist);
		
		
	}
}
