public class ExceptionPropogation {
 public static void m1() {
  System.out.println(" I am inside m1 method ");
  System.out.println(10/0);
 }
 public static void m2() {
  System.out.println("I am inside m2 method ");
  System.out.println(" Now calling m1 method ");
  m1();
 }
 public static  void m3() {
  System.out.println(" I am inside m3 method ");
  System.out.println(" Now m2 method is called ");
  m2();
 }
 public static void main(String[] args) {
  try {
   System.out.println("I am inside main method");
   System.out.println("Now m3 method is called");
   m3();
  }
  catch(Exception e) {
   System.out.println("Exception handled by main method");
  }
 }
}