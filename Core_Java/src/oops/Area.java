package oops;

import java.util.Scanner;

public class Area {

	private static int length;
	private static int breadth;

	/*
	 * Write a program to print the area of a rectangle by creating a class named 'Area' 
	 * having two methods. First method named as 'setDim' takes length and breadth of
	 *  rectangle as parameters and the second method named as 'getArea' returns the area
	 *  of the rectangle. Length and breadth of rectangle are entered through keyboard.
	 */
	
	
	void setDim(int length,int breadth){
		
		this.length = length;
		this.breadth = breadth;
		
	}
	
		static double getArea() {

		double area = length*breadth;
		return area;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		
		System.out.println("Enter the breadth: ");
		int breadth= sc.nextInt();
		
		Area a = new Area();
		
		a.setDim(length, breadth);
		
		double area= getArea();
		
		System.out.println("Area of Rectangle is: "+area);
	}
	
	
}
