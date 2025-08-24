package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Stream3 {
	public static void main(String[] args) {
		
		
		List<Integer> l = Arrays.asList(10,20,40,50);
		
		Function<Integer , Double> fn = (i)->i*1.0;
		
		l.stream().map(fn).forEach((i)->System.out.println(i));
		
	}
}
