package Static;

public class staticExample {

	int rollno;
	String name;
	static String college = "Trichandra";
	
	static void change() {
		college = "ASCOL";
	}
	
	staticExample(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+ " " + name + " " + college + "\n");
	}
	
	public static void main(String[] args) {
		
		staticExample s1 = new staticExample(111,"Amrit");
		s1.display();
		
		staticExample.change();
		staticExample s2 = new staticExample(222,"Bindu");
		staticExample s3 = new staticExample(333,"Champ");
		s1.display();
		s2.display();
		s3.display();
	}
	
	
}
