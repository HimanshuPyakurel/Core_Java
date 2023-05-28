package Abstract_program.MediamProgram;

public class Area extends Shape {

	void RectangleArea(int length,int breadth) {
		System.out.println("Area of rectangle is: "+length*breadth);
	}
	
	void SquareArea(int side) {
		
		System.out.println("Area of Square is : "+ side*side);
	}
	
	void CircleArea(float radius) {
		System.out.println("Area of Circle is : " +(3.14/2)*radius*radius);
	}
	
}
