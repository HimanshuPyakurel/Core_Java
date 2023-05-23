package Inheritance;

public class Manager extends Member {
	
	String department, specialization;
	
	void print() {
		
		super.printSalary();
		System.out.println("Secialization on : "+specialization);
		System.out.println("Department : "+department);
		
	}

	public static void main(String[] args) {
		
		Manager m =new Manager();
		
		m.name = "MA";
		m.phone = "982123123";
		m.address = "tikathali";
		m.age = 23;
		m.salary = 23123;
		m.specialization = "Technical";
		m.department = "finance";
		
		m.print();
		
	}
}
