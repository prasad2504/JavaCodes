
public class Vahicle {
	
	public void start() {
		System.out.println("vehicle is starting");
	}

	public static void main(String[] args) {
		
		Vahicle v1 = new Vahicle () {
			public void start() {
				System.out.println("helicopter fuel cheaked");
				System.out.println("helicopter started");
			}
		};
		v1.start();
		
		Vahicle v2 = new Vahicle() {
			public void start() {
				System.out.println("bicycle is starting ");
			}
		};
		v2.start();
	}
}