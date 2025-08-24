import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
	
	public static void main(String[] args) {
		//insertion but  order is not maintain
		HashSet a1 = new HashSet();
		a1.add("mango");
		a1.add("banana");
		a1.add("aplle");
		a1.add("Guava");
		a1.add("mango");
		
		
		Iterator i1= a1.iterator();
		while(i1.hasNext()) {
		    System.out.println(i1.next());	
		}
		
	}

}
