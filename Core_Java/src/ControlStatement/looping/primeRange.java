package ControlStatement.looping;

import java.util.Scanner;

public class primeRange {
	
	public static void main(String[] args) {

		int lower, upper,c=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number:");
		lower =sc.nextInt();
		upper = sc.nextInt();

	    for (int i = lower; i <= upper; i++) 
	       if (isPrime (i)) {
	        System.out.print(i +" , ");
//	        c=c++;
//	        System.out.println(c);
	       }
	   }

	 static boolean isPrime (int n)
	   {

	     // 0, 1 negative numbers are not prime
	     if (n < 2)
	       return false;

	     // checking the number of divisors b/w 1 and the number n-1
	     for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }

	     // if reached here then must be true
	     return true;
	   }
		

}
