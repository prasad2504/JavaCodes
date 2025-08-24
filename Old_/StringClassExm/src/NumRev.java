import java.util.Scanner;

public class NumRev {
	public static void main(String[] args) {
		
		int no;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter any num");
		no=sc.nextInt();
		String s=no+"";
		StringBuilder s3 = new StringBuilder(s);
		s3.reverse();
		if(s.equals(s3.toString())) {
			System.out.println(no +"  is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}
}
