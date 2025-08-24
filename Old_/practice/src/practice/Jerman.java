package practice;

public class Jerman extends Dog2 {

	public void abc() {
		System.out.println("fwbhes");
	}
	
	public static void main(String[] args) {
		Animal2 a1 =new Animal2();
		a1.sound();
		
		Dog2 d1 = new Dog2();
		d1.sound();
		
		Jerman j1 = new Jerman();
		j1.sound();
		j1.abc();
	}
}
