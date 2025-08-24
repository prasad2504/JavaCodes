
public class Students {
	
	int roll;
	String name;
	static String SchName;
	
	public void show(int roll, String name) {
		System.out.println("roll :" + roll);
		System.out.println("name :" + name);
		
	}
	
	static public void test(String SchName) {
		
		System.out.println("schName :" +SchName);
	}
	
	public static void  main(String args[]) {
		Students a=new Students();
		
		a.show(10,"prasad");
		System.out.println(a);
		Students.test("Sinhgad Clg");
	}

}
