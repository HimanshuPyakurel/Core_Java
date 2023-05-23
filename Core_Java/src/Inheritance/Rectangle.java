package Inheritance;

public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void printArea() {
		
		int area = (length*breadth);
		System.out.println("Area of Rectangle is : "+ area);
	}
	
	void printPerimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle is : "+ perimeter);
	}

	
}
