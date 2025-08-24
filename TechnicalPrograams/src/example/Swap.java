package example;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A:");
		int a = sc.nextInt();
		System.out.println("enter B:");
		
		int b =sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		
	}

}
