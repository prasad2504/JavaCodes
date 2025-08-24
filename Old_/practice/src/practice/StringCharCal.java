package practice;

import java.util.HashMap;

public class StringCharCal {


	public static void main(String[] args) {
		
		String str = "my name is prasad";
		
		HashMap <Character , Integer> h1 = new HashMap<Character , Integer>();
		
		for(char c:str.toCharArray()) {
			if(h1.containsKey(c)) {
				h1.put(c, h1.get(c)+1);
			}
			else {
				h1.put(c, 1);
			}
		}
		System.out.println(h1);

	}

}
