package Inheritance_Practice;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Engineer e = new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);
		e.printEmployee();
		
		System.out.println();
		
		Manager m = new Manager(207, "Barbara Johnson", "054-12-2367", 108501.36, "US Marketing");
		m.printManager();
		
		System.out.println();
		
		Admin a = new Admin(304, "Bill Munroe", "108-23-6509", 75002.34);
		a.printAdmin();
		
		System.out.println();
		
		Director d = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", 1000000);
		d.printDirector();
	}
}
