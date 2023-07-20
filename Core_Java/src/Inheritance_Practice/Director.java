package Inheritance_Practice;

public class Director extends Manager{

	private double budget;

	public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
		super(empId, name, ssn, salary, deptName);
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public void printDirector() {
		super.printManager();
		System.out.println("Budget     "+budget);
	}
	
	
}
