package PredicateExample;

import java.util.function.Predicate;

public class PredicateFunction {
	
	public static void somecondition(int i , Predicate<Integer> pred) {
		
		if(pred.test(20)) {
			System.out.println("Condition passed ...!");
		}else {
			System.out.println("Condition failed ...!");
		}
		
	}
	
	public static void main(String[] args) {
		
		somecondition(10, (i)->(i>10));	
		
	}

}
