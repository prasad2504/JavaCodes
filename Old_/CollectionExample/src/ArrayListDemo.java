import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		a1.add(12);
		a1.add(150);
		a1.add(45);
		a1.add(12);
		//a1.add("prasad");
		//a1.add(5.2);
		//a1.add("nahi");
		
		System.out.println(a1);
		
		a1.remove(1);
		
		System.out.println(a1);
		
		a1.add(1,100);
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		
		System.out.println(a1.contains(12));
		
		Collections.sort(a1);
		System.out.println(a1);
	}
}
