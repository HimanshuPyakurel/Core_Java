package ArraywithMethod;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		
		  int[] a = {10,11,12,13,1, 3, 4, 5,6,7,8,9};
		  
//		  Arrays.sort(a);
		  
		  System.out.println("Reverse Order:");
		  
		  for(int i=a.length-1; i>=0;i--) {
			  
			  System.out.print(a[i] + " ");
		  }
		  System.out.println();
		  	  
	}
}
