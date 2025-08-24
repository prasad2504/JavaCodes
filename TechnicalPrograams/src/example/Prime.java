package example;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int flag = 0;
		
		
		if(n<=1) {
			System.out.println("Not prime");
			
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag =1;
			}
		}
		
		if(flag==0) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
	}

}
