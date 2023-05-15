package Array;

import java.util.Scanner;

public class Program3 {

	/*
	 *	 Create a Java program to add two matrices of size 2x3.
	 */
	public static void main(String[] args) {
		
		int a[][] = new int[2][3];
		int b[][] = new int[2][3];
		int c[][] = new int[2][3];
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of first rows and cloumn:");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				a[i][j]= sc.nextInt();
			}
			System.out.println("");
		}
		
		System.out.println("Enter the value of second rows and cloumn:");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				b[i][j]= sc.nextInt();
				
			}
			System.out.println("");
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("After Addition:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(c[i][j]+"");
			}
			System.out.println("");
			
		}
			
		
		
	}
}
