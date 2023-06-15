package com.model;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {

	public static void main(String[] args) {
		
//		oneToOne();
//		oneToMany();
//		manyTomany();
		getEmp();
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
	
	static void manyTomany() {
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
		
		Department d1=new Department();
		d1.setName("IT");
		session.save(d1);
		
		Department d2=new Department();
		d2.setName("Admin");
		session.save(d2);
		
		emp.setPhoneList(Arrays.asList(p1,p2));
		emp.setDeptList(Arrays.asList(d1,d2));
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		
	}

	static void getEmp() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria crt = session.createCriteria(Employee.class);
		List<Employee> elist = crt.list();
		
		for(Employee e: elist) {
			System.out.println("id = "+e.getId());
			System.out.println("First Name = "+e.getFname());
			System.out.println("Last Name = "+e.getLname());
			System.out.println("Colour= "+e.getCar().getColor());
			System.out.println("Price= "+e.getCar().getPrice());
			
			List<Department> dlist = e.getDeptList();
			for(Department d: dlist) {
				System.out.println("Dept. Name = "+d.getName());
			}
			
		}
		
		
	}
}

