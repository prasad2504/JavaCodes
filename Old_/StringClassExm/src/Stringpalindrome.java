
public class Stringpalindrome {
	public static void main(String[] args) {
		
	
	String s1 = "lol";
	StringBuilder s2 = new StringBuilder(s1);
	s2.reverse();
	if(s1.equals(s2.toString())) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	}
}
