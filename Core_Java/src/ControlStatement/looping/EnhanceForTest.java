package ControlStatement.looping;

public class EnhanceForTest {
	
	/*
	 * ================= Enhance For loop/ForEach ===================
	 * 
	 * 	# Use to read data from collection.
	 * 	 
	 * 	Syntax:
	 * 
	 * 		for(data_type var : collection){
	 * 
	 * 		//statements
	 * 	
	 * 		}
	 * 
	 */
	
	public static void main(String[] args) {
		
		int values[] = {4,6,34,23,86,46,28,37};
		int s=0;
		
		for(int x : values) {
			
			System.out.println(x);
			s=s+x;
		}
		System.out.println("Sum is:"+s);
		
		
		
	}

}
