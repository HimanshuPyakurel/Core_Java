package Array;


public class Program2 {
	
	/*
	 * 	Write a program to find out whether a given 
	 * 	integer is present in an array or not.
	 */

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int find = 7;
		boolean found = false;
		
		for(int i: a) {
			if(i == find ) {
				found =true;
				break;	
			}
		}
		if(found) {
			System.out.println(find+" is present in the given array.");
		}

		else {
			System.out.println(find+" is not present in the given array.");
		}		
		
	}
}
