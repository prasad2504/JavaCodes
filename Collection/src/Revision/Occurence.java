package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Occurence {

	public static void main(String[] args) {
		
		String str= " my name is prasad P.";   //ascii code of space( ) = 32 and ascii code of . =   // A = 65 a = 97.
		
		Map <Character , Integer> m1 = new TreeMap<>();
		
		for(char c:str.toCharArray()) {
			if(m1.containsKey(c)) {
				m1.put(c, m1.get(c)+1);
			}
			else {
				m1.put(c, 1);
			}
		}
		
		System.out.println(m1);

	}

}
