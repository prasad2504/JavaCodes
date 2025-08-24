import java.util.Scanner;
public class B extends A{
	
	int age;
	
	public void prasad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age :");
		age =sc.nextInt();
	}
	
	public void Lm() {
		System.out.println("Age :" +age);
	}
	
}