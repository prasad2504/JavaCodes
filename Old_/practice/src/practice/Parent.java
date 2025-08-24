package practice;

public class Parent {
	
	public void display() {
		System.out.println("this is parent method");
	}

}

class child extends Parent{
	public void display() {
		super.display();
		
		System.out.println("this is child method");
	}
}


