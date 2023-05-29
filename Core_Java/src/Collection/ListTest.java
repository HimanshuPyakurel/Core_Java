package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String>  list = new ArrayList<>(); 
		List<String>  list = new LinkedList<>(); 
		
		list.add("nepal");
		list.add("india");
		list.add("china");
		list.add("canada");
		list.add("japan");
		
		//list.remove(2);
		//list.remove("Nepal")
		System.out.println(list.contains("japan"));
		
		
//		for(String s : list) {
//			System.out.println(s);
//		}
		
		
		list.forEach(s -> System.out.println(s));
		
		
	}
}
