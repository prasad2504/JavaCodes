import java.util.Scanner; 
 
public class Engineering { 
 int roll; 
 String name; 
  
 public void setData() { 
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter roll and name "); 
  roll=sc.nextInt(); 
  name=sc.next(); 
 } 
 public void showData() { 
  System.out.println("Student roll : " + roll); 
  System.out.println("Student name : " + name ); 
 } 
  
}