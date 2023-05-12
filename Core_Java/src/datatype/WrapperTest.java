package datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperTest {
	/*
	 * ================== Wrapper Class ================
	 * # every primitive data type has respective class 
	 * 	 is known as wrapper class.
	 * 
	 *  Primitive type    Wrapper class
	 *  --------------    -------------
	 *  byte               	Byte
	 *  short				Short
	 *  int 				Integer
	 *  long				Long
	 *  float				Float
	 *  double				Double
	 *  char				Character
	 *  boolean				Boolean
	 *  
	 */

	public static void main(String[] args) {
		
		// 'x' is int variable only
		int a=700; //primitive type
		
		// 'k' is int variable and object also
		Integer k=500; //Wrapper type

		//==================== auto-boxing ====================
		/*
		 * conversion of primitive type into wrapper type.
		 * 
		 */
		
		int p = 3456;
		Integer m=p; //auto-boxing
		
		
		
		//====================auto-unboxing ==================
		/*
		 * conversion of wrapper type into integer type.
		 * 
		 */
		
//		Double h =345643.23143242;
//		double l = h; // auto-unboxing
//		
//		int r = 6000;
//		System.out.println(Integer.toBinaryString(r));
//		System.out.println(Integer.toOctalString(r));
//		System.out.println(Integer.toHexString(r));
		
		
		//===================== Big Number ==================
		/*
		 * 1> Big Integer
		 * 2> Big Decimal
		 */
		
		Integer a1 = Integer.MAX_VALUE;
		Integer b1 = Integer.MAX_VALUE;
		
		BigInteger c = BigInteger.valueOf(a1).add(BigInteger.valueOf(b1));
		System.out.println(c);
		
		BigDecimal bd = BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.valueOf(Double.MAX_VALUE));
		System.out.println(bd);
	
		
	}
}
