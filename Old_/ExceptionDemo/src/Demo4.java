public class Demo4 {
 public static void main(String[] args) {
  int [] a = new int[5];
  a[0] = 76;
  a[4] = 64;
  try {
   System.out.println(a[0]);
   System.out.println(a[4]);
   System.out.println(a[5]);
  }
  catch(ArrayIndexOutOfBoundsException e) {
   System.out.println("Wrong index ");
  }
  System.out.println("End of program");
 }
}

