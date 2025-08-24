import java.util.Scanner;

public class Demo3 {
 public static void main(String[] args) {
  int a,b;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any two numbers ");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("Addition :  " + (a+b));
  try {
   System.out.println("Division : " + (a/b));
  }
  catch(ArithmeticException e) {
   System.out.println("You are trying to divide by zero");
  }
  System.out.println("Multiplication : " + (a*b));
  System.out.println("Subtraction :  " + (a-b)) ;
 }
}