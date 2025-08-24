public class Student1 { 
 //fields or instance fields or attributes or properties 
 int roll; 
 String name; 
 int marks; 
 //setter method 
 public void setRoll(int r) { 
  roll=r; 
 } 
 //getter method 
 public int getRoll() { 
  return roll; 
 } 
 public void setMarks(int m) { 
  marks=m; 
 } 
 public int getMarks() { 
  return marks; 
 } 
  
 public void setName(String n) { 
  name=n; 
 } 
 public String getName() { 
  return name; 
 } 
 public void setData() { 
  roll=10; 
  name="Megha Sumant"; 
  marks=63; 
 } 
 public void printData() { 
  System.out.println("Roll : "+ roll); 
  System.out.println("Name : " + name); 
  System.out.println("Marks : " + marks); 
 } 
 public static void main(String[] args) { 
  // creating object of the class 
  Student1 s1 =new Student1(); 
   
  //Student s1 = new Student(); 
  // method call 
  //s1.setData(); 
  
  s1.setRoll(103); 
  s1.setName("Megha Sumant"); 
  s1.setMarks(80); 
  s1.printData();
  
  Student1 s2 = new Student1(); 
  s2.setRoll(104); 
  s2.setMarks(79); 
  s2.setName("Uma Joshi"); 
  s2.printData(); 
  
  
  System.out.println(s1.getRoll()); 
  //System.out.println(s1.getName()); 
  //System.out.println(s1.getMarks()); 
   
  System.out.println(s2.getRoll()); 
  //System.out.println(s2.getName()); 
  //System.out.println(s2.getMarks()); 
 } 
}