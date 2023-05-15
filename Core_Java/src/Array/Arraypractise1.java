package Array;

import java.util.Scanner;

public class Arraypractise1 {
	
	/* WAP to store and print total price, average price of 10 books. 
	 */
 
	public static void main(String[] args) {
		
		int price[] = new int[10];
		int total=0;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<price.length;i++) {
			System.out.println("Enter the price:");
			price[i] = sc.nextInt();
		}
		
		for(int x :price) {
			System.out.println(x);
			total =total + x;
		}
		System.out.println(" Total Price of book is:"+total);
		avg = total/price.length;
		System.out.println(" Average Price of book is:" + avg);
		

		
		
		
		
		
		
	}
}
