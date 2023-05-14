package ControlStatement.selection;

public class LadderTest {
	
	/*
	 * ============= else if ===============
	 * syntax:
	 * 
	 * 	if(condition-1){
	 * 
	 * 	}else if(condition-2){
	 * 
	 * 	}
	 * 	.....................
	 * 	....................
	 * 	....................
	 * 
	 * 	else{
	 * 
	 * 	}
	 * 
	 */
	
	public static void main(String[] args) {
		
		int age = 26;
		
		if(age >=70) {
			
			System.out.println("Old age....");
			
		}
		
		else if(age >= 45) {	
			System.out.println("Adult...");
		}
		
		else if(age >= 30) {
			System.out.println("Young...");
		}
		
		else if(age >= 20) {
			System.out.println("Bachelor...");
		}
		
		else if(age >= 13) {
			System.out.println("Teenager...");			
		}
		
		else {
			System.out.println("Child...");
		}
		
	
	}

}
