package ArraywithMethod;

public class ArraywithMethod {
	/*
	 *  =================== Array With Method =============
	 *    a> array as parameter:
	 *           
	 *           //50 values  
	 *          
	 *          void sum(int a[]){
	 *          
	 *          }          
	 *          
	 *     b> array as return type
	 *        
	 *        int[] get20IntValue(){
	 *        
	 *        return array;
	 *       
	 *        }       
	 */
	
	public static void main(String[] args) {
		
//		addArray(new int[] {2, 1, 31, 23, 12, 43, 24, 34 ,53, 46}); //Anonymous Array
		
		int a[]= {2, 1, 31, 23, 12, 43, 24, 34 ,53, 46,21,23};
		addArray(a);	
		small(a);
		countEven(a);
		

		
	}
	
	static void addArray(int values[]) {
		int s=0;
		
		for(int x: values) {
			s=s+x;
		}
		System.out.println("Total= "+s);
	}
	
	static void small(int values[]) {	
		int sv=values[0];
		
		for(int x : values) {
			if(sv > x) {
				sv=x;
			}
		}
		System.out.println("Smallest number is: "+sv);
		
	}
	
	static void countEven(int values[]) {	
		int o=0, e=0;
		for(int x : values) {
			if(x%2==0) {
				e++;
			}
			else
				o++;
		}
		System.out.println("Even Count is: "+e);
		System.out.println("Odd Count is: "+o);
	}
	
	
	
	
	
}
