import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> a1 = new LinkedList<String>();
		a1.addFirst("prasad");
        a1.addLast("shreyash");
        a1.add("suraj");
        a1.add("pratik");
        a1.removeFirst();
        
        
        Iterator itr = a1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}
} 

 

