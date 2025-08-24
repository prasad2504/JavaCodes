import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		
		int m1=0,m2=0,m3=0;
		String name;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of student");
		name=sc.nextLine();
		
		System.out.println("enter the marks of core java");
		
		try {
		m1=sc.nextInt();
		if(m1>100 || m1<0) {
			throw new InvalidMarksException("you have entered wrong marks");
		}
		}
		catch(InvalidMarksException myex) {
			System.out.println(myex);
		}
		
		System.out.println("enter the marks of frontend");
		try {
		m2=sc.nextInt();
		if(m2>100 || m2<0) {
			throw new InvalidMarksException("you have entered wrong marks");
		}
		}
		catch(InvalidMarksException myex) {
			System.out.println(myex);
		}
		
		
		System.out.println("enter the marks of backend");
		try {
		m3=sc.nextInt();
		if(m3>100 || m3<0) {
			throw new InvalidMarksException("you have entered wrong marks");
		}
		}
		catch(InvalidMarksException myex) {
			System.err.println(myex);
		}
		
		System.out.println("Hello Dear " +name);
		System.out.println("Marks of core java :" +m1);
		System.out.println("Marks of frontend :" +m2);
		System.out.println("Marks of backend :" +m3);
		
		System.out.println("Total marks :" +(m1+m2+m3));
		System.out.println("avrage marks:" +(m1+m2+m3)/3);
	}
	
	
	
}
