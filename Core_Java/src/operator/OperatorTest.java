package operator;

public class OperatorTest {
	
	public static void main(String[] args) {
		
		int x=10;
		
		System.out.println(x++); //10 but increment by 1
		System.out.println(x+5); //16 : 11+5
		
		System.out.println(++x); //12: 11 increment by 1
		System.out.println(++x + x++); //26 : 13+13
		System.out.println(x); //14
	}

}
