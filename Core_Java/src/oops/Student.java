package oops;

import java.util.Scanner;

public class Student {
	
	/*
	 * Assign and print the roll number, phone number and 
	 * address of two students having names "Sam" and "John" 
	 * respectively by creating two objects of class 'Student'.
	 * 
	 */
		
		int roll;
		double phone;
		String name;
		String Address;
		
		
		
		void print() {
		
			System.out.println("Roll no:"+roll);
			System.out.println("Name:"+name);
			System.out.println("Phone number:"+phone);
			System.out.println("Address:"+Address);
			
		}
		
		public static void main(String[] args) {
			
			
			Student s =new Student();
			Student b = new Student();
			
			Scanner sc =new Scanner(System.in);
			
			
			System.out.println("For Sam:");
			s.name = "Sam";
			System.out.println("Enter Roll no:");
			s.roll = sc.nextInt();
			System.out.println("Enter Phone number:");
			s.phone = sc.nextDouble();
			System.out.println("Enter Address:");
			s.Address = sc.next();
			
			System.out.println();

			System.out.println("For John:");
			b.name = "John";
			System.out.println("Enter Roll no:");
			b.roll = sc.nextInt();
			System.out.println("Enter Phone number:");
			b.phone = sc.nextDouble();
			System.out.println("Enter Address:");
			b.Address = sc.next();
			
			System.out.println();
			
			s.print();
			
			System.out.println();
			
			b.print();	
		
		}
		
}
