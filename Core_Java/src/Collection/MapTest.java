package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		
		//Student name, age
		
		//Map<String, Integer> map = new HashMap<>();
		
		//Map<String, Integer> map = new TreeMap<>();
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Hari", 30);
		map.put("Ram", 56);
		map.put("Nil", 24);
		map.put("Aman", 16);
		map.put("Shyam", 18);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = " +map.get(key));
		}
	
	
	}
}
