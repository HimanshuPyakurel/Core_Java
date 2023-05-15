package Array;

public class Program5 {
	
	/*
	 *  Write a Java program to find the maximum element in an array.
	 */

	public static void main(String[] args) {
		
		int a[] ={2,4,3,6,9};
		
        int max = a[0];  
        
        for (int i = 0; i < a.length; i++) {  
        	
           if(a[i] > max) {  
               max = a[i];  
           }   
        } 
        
    System.out.println("Maximum element present: " + max); 
		
		
	}
}
