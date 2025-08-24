package practice;

public class Dog implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("barkkk");
		
	}

	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.sound();
	}
}
