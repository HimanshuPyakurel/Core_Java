package ControlStatement.looping;

public class WhileTest {

	/*
	 * 	syntax:	
	 * 
	 * 		while(condition){
	 * 
	 * 			//statements
	 * 		
	 * 			//inc/dec
	 * 
	 * 		}
	 * 
	 */
	
	public static void main(String[] args) {
		
//		6! = 6*5*4*3*2*1
		
		int n=6;
		int fact = 1;
		
		while(n>1) {
			
			fact = fact*n;
			n--;
			
		}
		System.out.println("Result:"+fact);
		
		
		
		
	}
	
}
