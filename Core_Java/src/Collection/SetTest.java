package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
		//Set<String> str = new HashSet<>();	 // Unique data only 
		//Set<String> str = new TreeSet<>();     // unique + sorted data
		Set<String> str = new LinkedHashSet<>(); // unique + insertion in oder
		
		str.add("java");
		str.add("php");
		str.add("php");
		str.add("sql");
		str.add("java");
		str.add("android");
		
		str.forEach(s -> System.out.println(s));
		
	}
}
