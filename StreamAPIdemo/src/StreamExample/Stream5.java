package StreamExample;

import java.util.Arrays;
import java.util.List;

public class Stream5 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(102,450,780,320,456,102,125,888);
		
		list.stream().filter((item)-> item%5==0).forEach((i)->System.out.println(i));
		
	}
}
