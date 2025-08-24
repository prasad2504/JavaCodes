package example;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter word");
		String s = sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Np");
		}
	}

}
