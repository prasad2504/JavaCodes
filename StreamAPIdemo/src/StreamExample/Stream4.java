package StreamExample;

import java.util.Arrays;
import java.util.List;

public class Stream4 {
	
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("prasad","yash");
		
//		str.stream().map((i)->i.toUpperCase()).forEach((i)->System.out.println(i));
		
		str.stream().map((i)->(new StringBuffer(i.toUpperCase()).reverse())).forEach((i)->System.out.println(i));
		
	}

}


