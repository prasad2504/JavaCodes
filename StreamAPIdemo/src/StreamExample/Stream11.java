package StreamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream11 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(70);
		list.add(10);
		list.add(20);
		
		
		list.stream().sorted() .distinct().forEach((i)->System.out.println(i));
		
		//we can get sorted order easily in primitive data type but what if we want desending order of this similar
		
	}
}
