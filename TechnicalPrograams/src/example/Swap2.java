package example;

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A");
		int a=sc.nextInt();
		System.out.println("enter B");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a: " +a);
		System.out.println("b: "+b);
		
	}

}
