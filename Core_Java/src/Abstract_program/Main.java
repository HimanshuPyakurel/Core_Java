package Abstract_program;

public abstract class Main {
	
	Main(){
		System.out.println("This is constructor of main class.");
	}

	abstract void a_method();
	
	void print(){
		System.out.println("This is a normal method of abstract class.");
	}
}
