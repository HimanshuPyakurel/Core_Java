package oops;

public class Rectangle {
	
	
	int length, breadth;
	int area;
	
	void Area() {
		area = length*breadth;
		System.out.println("Length is: "+length);
		System.out.println("Breadth is: "+breadth);
		System.out.println("Area is: "+area);
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.length=5;
		r.breadth =6;
		r.Area();
		
		System.out.println();
		
		r.length=4;
		r.breadth =9;
		r.Area();
		
		
		
	}

}
