package Inheritance_Practice;

public class Engineer extends Employee{

	public Engineer(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
	}
	
	public void printEngineer() {
		super.printEmployee();
	}

}
