package practice;

import java.util.Scanner;

public class Employee {
	
	int salary;
	int number;
	
	public int getInfo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary: $");
		salary = sc.nextInt();
		System.out.println("Enter Number of hours of work per day: ");
		number = sc.nextInt();
		sc.close();
		return salary;
	}
	
	
	public void AddSalary() {
		
		if(salary < 500) {
			salary = salary+10;
		}
		
	}
	
	public void AddWork() {
		
		if(number > 6) {
			
			salary = salary+5;
			
		}	
		System.out.println("Total Salary is: $" +salary);
	}
	

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.getInfo();
		e.AddSalary();
		e.AddWork();
		
	}
	
	
}
