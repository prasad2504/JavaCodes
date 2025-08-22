package example;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		int orignal= n,reverse=0;
		
		while(n>0) {
			int digit=n%10;
			reverse = reverse*10+digit;
			n=n/10;
		}
		
		
		if(orignal == reverse) {
			System.out.println("number is palindrome");
		}else {
			System.err.println("not p");
		}
		
		
	}

}
