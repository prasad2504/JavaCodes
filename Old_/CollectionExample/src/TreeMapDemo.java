import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap m1 = new TreeMap();
		m1.put("prasad", "9857458567");
		m1.put("suraj", "8541253647");
		m1.put("shreyash", "7314526398");
		m1.put("shivam", "9965485214");
		m1.put("santosh", "7954856241");
		m1.put("prasad", "8045789612");


//		try {
//		m1.put(null, "8045789612");
//		}
//		catch(NullPointerException e) {
//			System.out.println("null not allowed");
//		}

		
		
		//1st way toString method
		System.out.println(m1);
		System.out.println(m1.get("santosh"));

		
	}

}
