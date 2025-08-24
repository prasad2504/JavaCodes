
public class Animal5 {
	
 public void sound() {
	 System.out.println("sound");
 }
 
}

class Dog5 extends Animal5 {
	public void sound() {
		System.out.println("bark");
	}
}

class Cat5 extends Animal5 {
	public void sound() {
		System.out.println("meow");
	}
	
	
}

class test  {
	public static void main(String[] args) {
		Animal5 a1 ;
		
	 a1 = new Dog5();
		a1.sound();
		
	a1 = new Cat5();
	
		a1.sound();
	}
}
