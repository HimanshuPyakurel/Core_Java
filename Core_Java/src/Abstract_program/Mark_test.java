package Abstract_program;

public class Mark_test {
	public static void main(String[] args) {
	
		Marks t = new SubjectA(1,2,4);
		float x = t.getPercentage();
		System.out.println(x);
		
		Marks u = new SubjectB(4,4,4,5);
		float y = u.getPercentage();
		System.out.println(y);
	
	}
}
