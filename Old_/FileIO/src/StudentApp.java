import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentApp {
 static Scanner sc;
 static ArrayList<Student> studentlist;
 
 public static void addstudent() {
  int r,f,p;
  String n,a,e,m,c;
  
  System.out.println("Enter the students roll number ");
  r=sc.nextInt();
  
  sc.nextLine();
  
  System.out.println("Enter the students name ");
  n=sc.nextLine();
  
  
  System.out.println("Enter the student address:");
  a = sc.nextLine();
 
  System.out.println("Enter the student email:");
  e = sc.nextLine();
 
  System.out.println("Enter the student mobile:");
  m = sc.nextLine();
 
  System.out.println("Enter the student course:");
  c = sc.nextLine();
 
  System.out.println("Enter the student fees:");
  f = sc.nextInt();
 
  System.out.println("Enter the student pending fees:");
  p = sc.nextInt();
 
  Student s1 = new Student(r,n,a,e,m,c,f,p);
  studentlist.add(s1);
 }
// public static void main(String[] args) {
 public StudentApp() {
  int opt=0;
  studentlist = new ArrayList<Student>();
  sc = new Scanner(System.in);
  do {
   System.out.println("1. Add a new Student ");
   System.out.println("2. Show all students ");
   System.out.println("3. Delete any student ");
   System.out.println("4. Update student details ");
   System.out.println("5. Show Java Course Student");   
   System.out.println("6. Show python Course Student"); 
   System.out.println("7. Students who live in pune");
   System.out.println("8. Show total paid fees");
   System.out.println("9. Show total pending fees");
   System.out.println("10. sort by fees");
   System.out.println("11. sort by Pending fees");
   System.out.println("12. sort by Roll No");
   

   System.out.println("15. Exit ");
   System.out.println("Enter your option ");
   opt=sc.nextInt();
   switch(opt) {
   case 1:addstudent();
     break;
   case 2:showstudents();
     break;
   case 3: deletestudent();
     break;
   case 4: updatestudent();
     break;
   case 5: showjavastudents();
     break;
   case 6:showpythonstudents();
     break;
   case 7: punestudent();
     break;
   case 8: totalfees();
     break;
   case 9: totalpendingfees();
    break;
   case 10 : SortStudentbyFees();
   break;
   case 11: sortByPendingFees();
   break;
   case 12: sortByRollNo();
   break;
   
   }
  }while(opt!=15);
 }
 
 
private static void sortByRollNo() {
	// TODO Auto-generated method stub
	Collections.sort(studentlist,new RollComparable());
	for(Student s : studentlist) {
		System.out.println(s);
	}
	
}
private static void sortByPendingFees() {
	// TODO Auto-generated method stub
	
}
private static void SortStudentbyFees() {
	// TODO Auto-generated method stub
	
	Collections.sort(studentlist);
	
	for(Student s : studentlist) {
		System.out.println(s);
	}
	
}
private static void updatestudent() {
  System.out.println("Enter the roll number of student to update ");
  int r = sc.nextInt();
  
  sc.nextLine();
  
  int f,p;
  String n,a,e,m,c;
  for(Student s : studentlist) {
   if(s.getRoll() == r) {
    //updation functionality
    System.out.println("Enter the students updated name ");
    s.setName(sc.nextLine());
    
    System.out.println("Enter the student updated address:");
          s.setAdd(sc.nextLine());
   
          System.out.println("Enter the student updated email:");
          s.setEmail(sc.nextLine());
   
          System.out.println("Enter the student updated mobile:");
          m = sc.nextLine();
          s.setMobile(m);
   
          System.out.println("Enter the student updated course:");
          c = sc.nextLine();
          s.setCourse(c);
          
          System.out.println("Enter the student updated fees:");
          f = sc.nextInt();
          s.setFess(f);
          
          System.out.println("Enter the student updated pending fees:");
          p = sc.nextInt();
          s.setPendingfees(p);
          System.out.println("The student data is updated");
   }
  }
  
 }
 private static void deletestudent() {
  System.out.println("Enter the roll number of student to delete ");
  int r = sc.nextInt();
//  Iterator i1 = studentlist.iterator();
//  while(i1.hasNext()) {
//   Student s1 = (Student) i1.next();
//   if(s1.getRoll()==r) {
//    i1.remove();
//    System.out.println("The Student is deleted");
//    break;
//   }
//  }
  
  for(Student s : studentlist) {
   if(s.getRoll() == r) {
    studentlist.remove(s);
    System.out.println("The student is deleted");
    break;
   }
  }
  
 }
 public static void showstudents() {
	 System.out.println("\n Roll   Name    Address    Email   Mobile   Course   Fees paid  Pending Fees ");
	 System.out.println("\n------------------------------------------------------------------------------");
 //System.out.println(studentlist);
  for(Student s1 : studentlist) {
   System.out.println(s1);
  }
//  System.out.println("\n Roll   Name    Address    Email   Mobile   Course   Fees paid  Pending Fees ");
//  System.out.println("\n------------------------------------------------------------------------------");
//  Iterator<Student> i1 = studentlist.iterator();
//  while(i1.hasNext()) {
//   System.out.println(i1.next());
//  }
 }
 
 private static void showjavastudents() {
	  for(Student s1 : studentlist) {
	   if(s1.getCourse().contains("java")) {
	    System.out.println(s1);
	   }
	  }
	  
	 }
 private static void showpythonstudents() {
	  for(Student s1 : studentlist) {
	   if(s1.getCourse().contains("python")) {
	    System.out.println(s1);
	   }
	  }
	  
	 }
 private static void punestudent() {
	  for(Student s1 : studentlist) {
	   if(s1.getAdd().contains("pune")) {
	    System.out.println(s1);
	   }
	  }
	  
	 }
 
 private static void totalfees() {
	 double totalFees=0;
 for (Student student : studentlist) {
     totalFees += student.getFess();
 }

 // Display the total fees paid
 System.out.println("Total fees completed by all students: " + totalFees);
}

 private static void totalpendingfees() {
	 double totalpendingFees=0;
 for (Student student : studentlist) {
     totalpendingFees += student.getPendingfees();
 }

 // Display the total fees paid
 System.out.println("Total fees completed by all students: " + totalpendingFees);
}

 
 
}