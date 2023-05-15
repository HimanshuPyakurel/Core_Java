package Array;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int age[] = new int[5];
		
	
	//write data in array
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<age.length;i++) {
			
			System.out.println("Enter your age:");
			age[i] =sc.nextInt();
		}
		
		
	//read data from array
		for(int x:age ) {
			System.out.println(x);	
		}
		
		
		
	}

}
