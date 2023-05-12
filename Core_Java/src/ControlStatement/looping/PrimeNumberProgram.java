package ControlStatement.looping;

import java.util.Scanner;

public class PrimeNumberProgram {
	
	/*
	 * 	Q> WAP to check prime number
	 */
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		Boolean flag = false;
		
	    if(num == 0 || num == 1) {	
	    	System.out.println(num+" is not a prime number.");
	    }
	    
	    else {
	    	for (int i = 2; i <= num / 2; ++i) {
	    		
	      // condition for non-prime number   	 	
	    	if (num % i == 0) { 
	    		System.out.println(num + " is not a prime number.");
	    		flag= true; 		 
	    		break;
	    		}
	    	}

		   if(flag == false){
		      System.out.println(num + " is a prime number.");
		   	}
	   
	    }
	    
	       
	    
	}
}
