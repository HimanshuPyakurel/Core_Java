package ArraywithMethod;

import java.util.Scanner;

public class MultiDarray {
	
	/*
	 * Use to manage data in matrix/table
	 * 
	 *   syntax:
	 *   
	 *   data_type array_name[][] = new data_type[rows][columns]
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		//write data in array
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			for(int j=0; j<2;j++) {
				
			System.out.println("Enter the value for mat:");
			mat[i][j] =sc.nextInt();
			}
		}
		
		//read data from array
		
		for(int i=0;i<2;i++) {
			for(int j=0; j<2;j++) {
			System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(mat[0][1]);
		
	}
}
