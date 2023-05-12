package ControlStatement.looping;

public class JumpTest {
	
	/*
	 * =========== Jump Statements ======
	 * 
	 * 1> Break    : exit from loop 	// Related to loop
	 * 2> Continue : skip values		// Related to loop
	 * 3> return   : exit from method	// Related to method
	 * 
	 */

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			
			if(i==6 || i ==9) {
				//break;
				//continue;
				return;
				
			}
			System.out.println(i);
			
		}
		
		System.out.println("End for loop");
		
		
	}
}
