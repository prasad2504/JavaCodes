package example;

import java.util.Scanner;

public class Fibo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int t1=0,t2=1,next;
		
		for(int i=1;i<=n;i++) {
			System.out.print(t1+" ");
			next=t1+t2;
			t1=t2;
			t2=next;
		}
		
	}

}
