import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet a1 = new LinkedHashSet();
		a1.add("mango");
		a1.add("banana");
		a1.add("apple");
		a1.add("guava");
		a1.add("mango");
		
		
		Iterator i1= a1.iterator();
		while(i1.hasNext()) {
		    System.out.println(i1.next());	
		}
		
	}
}
