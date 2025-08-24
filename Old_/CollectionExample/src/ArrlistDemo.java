import java.util.ArrayList;
import java.util.Iterator;

public class ArrlistDemo {

	public static void main(String[] args) {
		
		ArrayList<String>  a1=new ArrayList<String> ();
		a1.add("harry");
		a1.add("gina");
		a1.add("Ron");
		a1.add("Luna");
		
		//1st way to print
		System.out.println(a1);
		
		//2nd way to print
		System.out.println("---------------printing element using normal for loop");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		//3rd way
		System.out.println("---------------using for each loop");
		//for(datatype varname : collection)  //Read-for each string x in a1
		for(String x : a1) {
			System.out.println(x);
		}

		//4th way to print the ArrayList
		//using iterator
		System.out.println("--------------------------using itertor");
		Iterator i1=a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}	
	}
}
