package practice;

public class Cat extends Animal2{
	
	public void sound() {
		System.out.println("meow");
	}

	
	public static void main(String[] args) {
		 Animal2 a1=new Animal2();
		 a1.sound();
		 
		 Dog2 d1 = new Dog2();
		 d1.sound();
		 
		 Cat c1 = new Cat();
		 c1.sound();
	}
}
