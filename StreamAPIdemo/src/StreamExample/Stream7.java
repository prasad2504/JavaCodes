package StreamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream7 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list =  Arrays.asList(10,25,14,45,8,99);
		
		System.out.println(list.stream().count());
		System.out.println("_______________________________________");

		
		System.out.println(list.stream().max(new nocomparator()));
		System.out.println("_______________________________________");
		

		System.out.println(list.stream().min(new nocomparator()));
		System.out.println("_______________________________________");
		
		
		list.stream().limit(4).forEach((i)->System.out.println(i));
		System.out.println("_______________________________________");

		list.stream().skip(5).forEach((i)->System.out.println(i));
		System.out.println("_______________________________________");

		
		
	}

}


class nocomparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
	}
	
}