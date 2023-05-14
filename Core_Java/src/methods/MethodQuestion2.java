package methods;

import java.util.Scanner;

public class MethodQuestion2 {
	
	/*
	 *  Q> Find SI and Amount as:
	 *     a> input
	 *     b> processing
	 *     c> output
	 */
	
	public static void main(String[] args) {
		
		input();
		
	}
	
	static void input() {
		 
		int P,T;
		float R;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter value of P:");
		P = sc.nextInt();
		
		System.out.println("Enter value of T:");
		T = sc.nextInt();
		
		System.out.println("Enter value of R:");
		R = sc.nextFloat();
		
		processing(P,T,R);
		
	}
	
	static void processing(int P, int T, float R) {
		
		double SI,amount;
		SI = (P*T*R)/100;
		amount =P*(1+ R*T);
		output(amount,SI);
		
	}
	
	static void output(double amount, double SI) {
		
		System.out.println("Simple Interest is:"+SI);
		System.out.println("Total Amount is:"+amount);
		
	}
	
	
	
	
	
	

}
