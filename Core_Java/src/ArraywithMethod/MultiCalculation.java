package ArraywithMethod;

public class MultiCalculation {

	public static void main(String[] args) {
		
		int mat1[][]= {{3,4,5},{1,1,2},{22,11,33}};
		
		int mat2[][]= {{2,1,3},{7,8,9},{12,31,43}};
		
		int mat3[][]= new int[3][3];
		
		System.out.println(mat1[2][1]);
		
		//Addition
		
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {

			mat3[i][j] = mat1[i][j] + mat2[i][j];
			System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
