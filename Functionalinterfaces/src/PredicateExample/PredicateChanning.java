package PredicateExample;

import java.util.function.Predicate;

public class PredicateChanning {
	
	
	
	public static void main(String[] args) {
		
		
		Predicate <Integer> pred =(i) -> (i>10);
		Predicate <Integer> pred2 = (i) -> (i<10);
		
		pred.test(11);
		pred2.test(11);
		
		System.out.println(pred.equals(pred2));  
		System.out.println(pred.and(pred2)); 
		System.out.println(pred.and(pred2).negate().test(34)); 
		System.out.println(pred.or(pred2)); 
		
	}

}
