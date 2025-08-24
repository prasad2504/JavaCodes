//import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		//insertion but  order is not maintain
		TreeSet a1 = new TreeSet();
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
