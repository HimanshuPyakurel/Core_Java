package datatype;

public class DataType {
	
	/* 
	 * ============ Data Type ===============================
	 * # proper data representation
	 * # proper memory allocation
	 * # proper operation to be perform
	 * 
	 * # Types:
	 * 1> Primitive :
	 * 		byte, short, int, long, float, double, char, boolean
	 * 
	 * 2> Non-primitive:
	 * 		string, array, classes, collection, Enum, Date
	 * 
	 */
	
	public static void main(String[] args) {
		
//		long a = 50000000000L; 		
//		float k = 5.6f;
		
		System.out.println("byte = "+Byte.SIZE+ " "+ Byte.MIN_VALUE+ " "+ Byte.MAX_VALUE);
		System.out.println("short = "+Short.SIZE+ " "+ Short.MIN_VALUE+ " "+ Short.MAX_VALUE);
		System.out.println("int = "+Integer.SIZE+ " "+ Integer.MIN_VALUE+ " "+ Integer.MAX_VALUE);
		System.out.println("long = "+Long.SIZE+ " "+ Long.MIN_VALUE+ " "+ Long.MAX_VALUE);
		System.out.println("float = "+Float.SIZE+ " "+ Float.MIN_VALUE+ " "+ Float.MAX_VALUE);
		System.out.println("double = "+Double.SIZE+ " "+ Double.MIN_VALUE+ " "+ Double.MAX_VALUE);
		System.out.println("char = "+Character.SIZE+ " "+ Character.MIN_VALUE+ " "+ Character.MAX_VALUE);
		
	}

}
