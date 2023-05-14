package ControlStatement.selection;

import java.util.Scanner;

public class SwitchProgram {

	/*Calculate Total Salary for following parts:
	 * 
	 * Post     Basic salary     bonus     total salary
	 * ....     ............     .....     ............
	 * MD        359000          20.69%       ?
	 * CEO       234770          18%          ?
	 * MANAGER   187000          17.88%       ?
	 * HELPER    127809          11%          ?
	 * 
	 */
	
	public static void main(String[] args) {
		
		String post;
		double BS,TS;
		double B;
		
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("Enter post:");
			post = sc.next();
		}
		
		switch(post.toUpperCase()) {
		
		case "MD":
			BS = 359000;
			B = 20.67;
			TS= BS + (B/100)*BS;
			System.out.println("Basic Salary:"+BS);
			System.out.println("Bonus:"+B);
			System.out.println("Total Salary:"+TS);
		break;
		
		case "CEO":
			BS = 234000;
			B = 18;
			TS= BS + (B/100)*BS;
			System.out.println("Basic Salary:"+BS);
			System.out.println("Bonus:"+B);
			System.out.println("Total Salary:"+TS);
		break;
		
		case "MANAGER":
			BS = 187000;
			B = 17.88;
			TS= BS + (B/100)*BS;
			System.out.println("Basic Salary:"+BS);
			System.out.println("Bonus:"+B);
			System.out.println("Total Salary:"+TS);
		break;
		
		case "HELPER":
			BS = 127809;
			B = 11;
			TS= BS + (B/100)*BS;
			System.out.println("Basic Salary:"+BS);
			System.out.println("Bonus:"+B);
			System.out.println("Total Salary:"+TS);
		break;
		
		default:
			System.out.println("Invalid Post");
				
		}
		
		
	}
	
	
	
	
	
	
	
}
