package ArraywithMethod;

public class SortArray {

	/*
	 * Write a Java program to find whether an array is sorted or not.
	 */
	
	public static boolean isSorted(int[] a)
    {
        // base case
        if (a == null || a.length <= 1) {
            return true;
        }
 
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        
        return true;
    }
 
    public static void main(String[] args)
    {
        int[] a = { 1, 3, 4, 2};
        System.out.println(isSorted(a));       
    }
	
}
