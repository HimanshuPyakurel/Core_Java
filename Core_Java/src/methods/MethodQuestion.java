package methods;

import java.util.Scanner;

public class MethodQuestion {
	
	/*
	 *  Q> Find area and volume as :
	 *  	
	 *  a> getArea :
	 *  	-> pass 1 and b as parameter
	 *      -> calculate area 
	 *      -> return area
	 *      -> call getArea in main method
	 *      
	 *  b> volume :
	 *     -> pass area and height as parameter
	 *     -> calculate volume
	 *     -> print area
	 *     -> print volume
	 *     -> call this method in main
	 * 		
	 */
	
	public static void main(String[] args) {
		
		int b,h;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of b:");
		b = sc.nextInt();
		
		int a = area(1,b);
		
		System.out.println("Enter value of h:");
		h = sc.nextInt();
		
		volume(a,h);
		
	}
	
	static int area(int l, int b) {
		 
		int area;
		area = l*b;
		System.out.println("Area is : "+area);
		return area;
	}
	
	static void volume(int area,int h) {
		
		int v;
		v= area*h;
		System.out.println("Area is : "+ area);
		System.out.println("Volume is : " + v);
		
		
	}

	
}
