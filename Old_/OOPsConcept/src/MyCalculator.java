
public class MyCalculator {
	
	//polymorphism example
	public void add(int a , int b) {
		System.out.println("Addition of two int " + (a+b));
	}
	
	public void add(float a , float b) {
		System.out.println("Addition of two floats    " + (a+b));	
	}
	

	public static void main(String[] args) {
		
		MyCalculator a = new MyCalculator();
		a.add(2, 5);
		a.add(1.5f, 2.5f);
		

	}

}
