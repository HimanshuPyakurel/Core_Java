package ControlStatement.selection;

import java.util.Scanner;

public class SwitchProgram1 {
	
	/*
	 * Q> Calculate add/sub/mul/div(+,-,*,/) of two integer value given by
	 * 	  user using switch
	 * 
	 */
	
	public static void main(String[] args) {
		
		int a,b;
		float R;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a and b:");
		a = sc.nextInt();
		b= sc.nextInt();
		System.out.println("Enter operator '+','-','*','/':");
	    char value  = sc.next().charAt(0);
	    
		
		switch(value) {
			
			case '+':
				R=a+b;
				System.out.println("Value is:"+R);
			break;
			
			case '-':
				R=a-b;
				System.out.println("Value is:"+R);
			break;
			
			case '*':
				R=a*b;
				System.out.println("Value is:"+R);
			break;
			
			case '/':
				R=a/b;
				System.out.println("Value is:"+R);
			break;
			
			default:
				System.out.println("Invalid Operator");
				
		}	
		
		
		
	}
	

}
