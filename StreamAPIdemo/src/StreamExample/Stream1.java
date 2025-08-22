package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,20,40,50,40);
		
		Consumer<Integer> cons = (i)->System.out.println(i*2);
 		
		Stream str = list.stream();
		
		
		str.forEach(cons);
//		str.forEach(cons); only once use
		
//		str.forEach((i)->{System.out.println(i);});
		
//		list.stream().forEach(cons); channing
		
	}
}
