
public class Calculator {
	
	public int add(int a , int b) {
		return a +b;
	}
	
	public int  add  (int a , int b , int c) {
		return  a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2, 50,10)); 
		System.out.println(c1.add(10, 40)); 
		
	}

}
