package ArraywithMethod;

import java.util.Arrays;

public class GetEvenNumbers {

	
	public static void main(String[] args) {
		
		int data[]= {1,3,5,7,9,12,14,16,18,10,22,23,25,27};

		int even[] = array(data);
		System.out.println(Arrays.toString(even));
	}
	
	static int[] array(int a[]) {
		
		int e=0;
		for(int i : a) {
			if(i%2==0) {
				e++;
			}
		}
		
		int[] even = new int[e];
		int i=0;
		
		for(int x: a) {
			
			if(x%2 == 0) {
				
				even[i]=x;
				i++;
			}
		}
		return even;
		


}

	
	
	
	
	
}
