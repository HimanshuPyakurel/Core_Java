package Inheritance;

public class Programmer extends Employee{

	String progLnag;
	String project;
	int bonus;
	
	void print() {
		
		super.print(); //Call parent i.e parent object
		
		System.out.println("Programming Language : "+progLnag);
		System.out.println("Project : "+project);
		System.out.println("Bonus : "+bonus);
	}
	 
}
