public class Sample {
	
	int no;
	String name;
	
	static String city;
	
	static {
		System.out.println("i am inside static block");
		city="pune";
	}
	
	public void m1(){
		
	}
	
	static public void m2() {
		city="pune";
		System.out.println(" i am inside static method");
		
	}
	
	
	
	public static void main(String[] args) {
		Sample a =new Sample();
		a.m1();
		
		Sample.m2();
	}

	
}
