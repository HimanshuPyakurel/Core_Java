package methods;

public class MethodTest {

	public static void main(String[] args) {
		
//		sum();
//		printTable(10);
		
//		int x = getSumOf1to100();
//		System.out.println("Sum of 100 nums = "+x);
		
		int small = findSmallestValue(10, 20);
		System.out.println("Smallest number is: "+small);
		
		
	}
	
	
	
	//1. no return type with no arguments.
	
	static void sum() {
		
		int x= 567;
		int y =345;
		
		int s=x+y;
		System.out.println("Total="+s);
	}
	
	
	//2. no return type with argument
	
	static void printTable(int n) {
		
		for(int i=1;i<10;i++) {
			System.out.println(n+"x"+i+" = "+(n*i));
		}
	}
	
	
	//3. return type with no argument
	
	static int getSumOf1to100() {
		
		int s=0;
		
		for(int i=1; i<=100;i++) {
			s=s+i;	
		}
		
		return s;
	}
	
	
	//4. return type with argument
	
	static int findSmallestValue(int a, int b) {
		
		if(a<b) {
			return a;
		}
		return b;
		
		
	}
	
	
	
	
	
	
	
	
}