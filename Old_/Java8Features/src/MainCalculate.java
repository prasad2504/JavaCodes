//lambda expression example. lambda use only for functional interface
public class MainCalculate {
	
	public static void main(String[] args) {
		
		Calculator c1 = (int a , int b) -> {
			System.out.println("add : " + (a+b));
			
		};
		c1.calculate(10, 20);
		
		Calculator c2 = (int a , int b) -> {
			System.out.println("Sub :" + (a-b));
		};
		c2.calculate(10, 20);
		
		
	}

}
