import java.util.Scanner;

public class A{
	
	int p;
	String s;
	
	public void data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id and name :");
		p=sc.nextInt();
		s=sc.next();		
	}
	
	public void display() {
		System.out.println("ID : " +p);
		System.out.println("Name :" +s);
	}
}