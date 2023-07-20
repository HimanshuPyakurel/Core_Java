package Inheritance_Practice;

public class Admin extends Employee{

	public Admin(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
	}

	public void printAdmin() {
		super.printEmployee();
	}
	
}
