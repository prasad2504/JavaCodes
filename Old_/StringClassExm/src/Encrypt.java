import java.util.Scanner;

public class Encrypt {
 public static void encrypt(String s) {
  for(int i=0; i<s.length(); i++) {
   System.out.print((char)(s.charAt(i)-4));
  }
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any string  ");
  String s = sc.next();
  System.out.println("The encrypted String : ");
  encrypt(s);
 }
}