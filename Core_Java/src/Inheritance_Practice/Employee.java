package Inheritance_Practice;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId, String name, String ssn, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void raiseSalary(double increase){
		
		salary = salary+increase;
	}
	
	public void printEmployee() {
		System.out.println("ID         "+empId);
		System.out.println("Name       "+name);
		System.out.println("SSN        "+ssn);
		System.out.println("Salary     "+salary);
		
	}


	
	
	
	
	
	
}
