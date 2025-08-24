public class Main {
public static void main(String[] args) {
		
		Animal a1 = new Animal(){

				public void sound() {
					System.out.println("bark");
			}
			
		};
		a1.sound();
		
		Animal a2 = new Animal() {
			public void  sound() {
				System.out.println("meow meow");
			}
		};
		a2.sound();
	
}
}
