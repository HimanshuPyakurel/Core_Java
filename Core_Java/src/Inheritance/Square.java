package Inheritance;

import java.util.Scanner;

public class Square extends Rectangle{

	Square(int length, int breadth) {
		super(length, breadth);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Square[] square = new Square[5];
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter Length : ");
			int length = sc.nextInt();
			
			System.out.println("Enter Breadth : ");
			int breadth = sc.nextInt();
			
			Square s = new Square(length,breadth);
			
			System.out.println(" ");
			
			s.printArea();
			s.printPerimeter();
			
			System.out.println(" ");
			
			square[i] = s;
			
		}
		
		for(Square  sq : square) {
			
			System.out.println("Length = "+sq.length);
			System.out.println("breadth = "+sq.breadth);
		}
		
		
	}

}
