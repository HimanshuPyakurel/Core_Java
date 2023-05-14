package ControlStatement.selection;

import java.util.Scanner;

public class IfElseTest {
	/*
	 * ================= if-else =================
	 * syntax:
	 * 		if(condition){
	 * 
	 * 		//statement
	 * 
	 * 		}
	 * 		else{
	 * 
	 * 		//statement
	 * 
	 * 		}
	 */
	
	public static void main(String[] args) {
		
//		int n=49;
//		
//		if(n%2==0) {
//			System.out.println(n +" is even number");
//		}
//		else {
//			System.out.println(n + " is odd number");
//		}
//		
		//Greatest between two numbers
		
		int n1,n2;
		try(Scanner sc =new Scanner(System.in);){
			System.out.println("Enter number n1:");
			n1 = sc.nextInt();
			System.out.println("Enter number n2:");
			n2 = sc.nextInt();
		}
		
		if(n1>n2) {
			
			System.out.println(n1+ " is the greatest number");
			
		}
		
		else {
			System.out.println(n2 + " is the greatest number");
		}
			
		
	}

}
