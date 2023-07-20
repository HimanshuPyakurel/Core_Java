package Inheritance_Practice;

public class Manager extends Employee{

	private String deptName;

	public Manager(int empId, String name, String ssn, double salary, String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void printManager() {
		
		super.printEmployee();
		System.out.println("Department "+deptName);
	}
	
	
	
	

}
