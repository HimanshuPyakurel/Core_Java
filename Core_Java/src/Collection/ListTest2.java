package Collection;

import java.util.List;

public class ListTest2 {
	
	public static void main(String[] args) {
	
		List<Integer> list = List.of(1,12,31,23,42,34,53,45);
		List<String> str = List.of("a","b","c");
		List<Character> ch = List.of('!','@','$');
		
		list.forEach(s -> System.out.println(s));
		str.forEach(s -> System.out.println(s));
		ch.forEach(s -> System.out.println(s));
		
	}
}
