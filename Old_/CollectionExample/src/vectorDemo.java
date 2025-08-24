import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("prasad");
		v.add("shivam");
		v.add("shreyash");
		v.add("suraj");
		Iterator <String> itr = v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}