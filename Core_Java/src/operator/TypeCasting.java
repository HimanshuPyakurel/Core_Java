package operator;

public class TypeCasting {
	
	/*
	 * =============== Type Casting ================
	 * 
	 * syntax:
	 * 		data_type variable = (data_type) val;
	 * 
	 * a> Implicit (auto casting) :
	 * 
	 * 		byte -> short -> int -> long -> float -> double
	 * 
	 * b> Explicit (by force casting) :
	 * 		
	 * 		double -> float -> long -> int -> short -> byte -> char	
	 */
	
	public static void main(String[] args) {
		
		byte k =45;
		double c =k; //(auto-casting)
		
		float p = 3747.5474f;
		int m = (int)p;
		
		long v =(long) p;
		System.out.println(v);
		
		int a = 45;
		int b =7;
		
		float c1 =(float)a/b;
		System.out.println(c1);
		System.out.printf("%.3f",c1);
		
		
		
	} 

}
