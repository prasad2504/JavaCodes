import java.util.Scanner;

public class Demo2 {

	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition" +(a+b));
		System.out.println("division" +(a/b));
		System.out.println("Mul" +(a*b));
		System.out.println("Sub" + (a-b));
	}
}
