package Constructor;

public class triangle {
	
	/*
	 *  Write a program to print the area and parameter of a triangle 
	 *  having base 3 and height 5 units by creating a class named 'triangle' 
	 *  without any parameter in its constructor.
	 */
	
	int base,height;
	float sum;
	
	triangle(){
		
		base = 3;
		height = 5;
		
	}
	 void print() {
		 
		 float area = (float)1/2*(base*height);
		 System.out.println("Base of triangle is : "+base);
		 System.out.println("Height of triangle is : "+height);
		 System.out.println("Area of triangle is : "+area);
	 }
	
	public static void main(String[] args) {
		
		triangle t = new triangle();
		t.print();
	}
	
	
}
