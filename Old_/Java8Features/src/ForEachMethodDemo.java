import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		ArrayList <Integer> a1 = new ArrayList<>();
		
		a1.add(56);
		a1.add(14);
		a1.add(20);
		a1.add(87);
		a1.add(55);
		
		//1
		System.out.println("1 :"+a1);
		
		
		//2
		for(int i=0; i<a1.size(); i++) {
			System.out.println("2:"+a1.get(i));
		}
		
		
		//3
		for(int m : a1) {
			System.out.println("3:"+a1);
		}
		
		
		//4
		Iterator<Integer> i1 =a1.iterator();
		while(i1.hasNext()) {
			System.out.println("4:"+i1.next());
		}
		
		
		//5
		ListIterator i2 = a1.listIterator();
		while(i2.hasNext()) {
			System.out.println("5:"+i2.next());
		}
		
		//6
		a1.forEach(n -> System.out.println("6:"+n));
		
		
	}
	
}
