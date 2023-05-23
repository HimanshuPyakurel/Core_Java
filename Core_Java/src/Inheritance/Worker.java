package Inheritance;

public class Worker extends Member{
	
	String department, specialization;
	
	void print() {
		
		super.printSalary();
		System.out.println("Secialization on : "+specialization);
		System.out.println("Department : "+department);
	}
	
	public static void main(String[] args) {
	
		Worker w = new Worker();
		
		w.name = "Nil";
		w.phone = "98243423123";
		w.address = "Gwagan";
		w.age = 24;
		w.salary = 23312313;
		w.specialization = "It";
		w.department = "IT";
		
		w.print();		
		
		
	}
}
