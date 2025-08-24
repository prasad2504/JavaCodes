package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("c");
		list.add("python");
		
		List<String> immutableList = Collections.unmodifiableList(new ArrayList<>(list));
		
	
		list.add("abc");
	
		System.out.println("list" + immutableList);
		
	}

}
