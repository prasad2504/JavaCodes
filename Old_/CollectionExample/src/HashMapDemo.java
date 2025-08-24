import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		m1.put("prasad", 95);
		m1.put("suraj", 78);
		m1.put("shreyash", 98);
		m1.put("vignesh", 85);
		m1.put("prasad", 85);
		m1.put(null, 98);
		
		
		System.out.println(m1);
		
		
		
	}
}
