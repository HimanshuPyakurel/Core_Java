package Abstract_program;

public class SubClass extends Main{
	
	void a_method() {
		System.out.println("This is abstract method.");
	}

	public static void main(String[] args) {
		
		Main m = new SubClass();
		m.a_method();
		m.print();
		
	}
}
