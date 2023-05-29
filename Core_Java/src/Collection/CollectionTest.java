package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,5,44,56,53,68,67,86);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list, 10);
		System.out.println(list);
		
	}
}
