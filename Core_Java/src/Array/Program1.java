package Array;

import java.util.Scanner;

public class Program1 {
	
	/*
	 * Create an array of 5 floats and calculate their sum.
	 * 
	 */
 
	public static void main(String[] args) {
		
		float a[] = new float[5];
		float s = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++){
			System.out.println("Enter the value:");
			a[i]=sc.nextFloat();
		}
		
		for(float i:a) {
			s=s+i;
		}
		System.out.println("Sum is:"+s);
		
		
		
	}
}
