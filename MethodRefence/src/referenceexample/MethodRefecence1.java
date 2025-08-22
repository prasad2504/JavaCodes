package referenceexample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodRefecence1 {
	public static void main(String[] args) {
		
		
		Function<Integer,Double>fun = Helper::cube;
		System.out.println(fun.apply(5));
		
		Consumer<Integer>con=Helper::consume;
		con.accept(11);
		
		Predicate<Integer>p=Helper::checkid;
		System.out.println(p.test(10));
		
	}

}

class Helper {
	
	int id=4;
	public static double cube(int num) {
		return num*num*num+1.0;
	}
	
	
	public static void consume(int i) {
		System.out.println(" "+i);
	}
	
	
	public static boolean checkid(int id) {
		return id>10;
	}
}
