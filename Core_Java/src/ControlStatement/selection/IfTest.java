package ControlStatement.selection;

import java.util.Scanner;

public class IfTest {
	
	/*
	 * ============== if ==============
	 * syntax:
	 * 
	 *  	if(condition){
	 *  	
	 *  	//statement 
	 * 
	 * 		 }
	 * 
	 */
	
	public static void main(String[] args) {
		
		int p,t,r ;
		double s ;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter P:");
		p =sc.nextInt();
		System.out.println("ENter T:");
		t =sc.nextInt();
		System.out.println("ENter R:");
		r =sc.nextInt();
		
		
		if(p !=0 && t!=0 && r!=0) {
			
			 s= (p*t*r)/100;
			 System.out.println("Total Simple Interest = " + s);
			 
		}
	}

}
