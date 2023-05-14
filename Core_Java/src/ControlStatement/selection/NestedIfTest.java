package ControlStatement.selection;

public class NestedIfTest {
	
	/*
	 * ====================== Nested if-else ====================
	 * 
	 * 	if(condition-1){
	 * 		
	 * 		if(condition-2){
	 * 
	 * 			if(condition-3){
	 * 			
	 * 			.......................
	 * 			.......................
	 * 			.......................
	 * 				
	 * 			}else{
	 * 
	 * 			}
	 * 
	 * 		}else{
	 * 
	 * 		}
	 * 
	 *	 }else{
	 * 
	 *	 }
	 * 
	 */
	
	public static void main(String[] args) {
		
		String citizen ="nepali";
		int age =40;
		boolean haveVoteid = true;
		
		if(citizen.equals("nepali")) {
			
			if(age >= 18) {
				
				if(haveVoteid) {
					
					System.out.println("U can Vote");
					
				}else {
					
					System.out.println("You don't have voter id");
					
				}			
								
			}else {
				
				System.out.println("You are under age");
			}
			
			
		}else {
			
		System.out.println("Invalid citizenship!!!");			
		
		}
		
		
		
	}

}
