package oops;

import java.util.Scanner;

public class AverageOf {
	
	/*
	 * Print the average of three numbers entered by user by creating a class
	 *  named 'AverageOf' having a method to calculate and print the average.
	 */
	
	
	
	int x, y, z;
	float avg;

	void method() {
		
		avg=(x+y+z)/3f;
		System.out.println("Average of three Numbers is: "+avg);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		AverageOf s =new AverageOf();
		
		System.out.println("Enter First number:");
		s.x=sc.nextInt();
		
		System.out.println("Enter Second number:");
		s.y=sc.nextInt();
		
		System.out.println("Enter Third number:");
		s.z=sc.nextInt();
		
		s.method();
		
	}

}
