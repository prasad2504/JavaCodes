package referenceexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodStatic {
	
	public static void main(String[] args) {
		
		Student.id=100;
		Supplier<Integer> sup =Student::displayid;
		System.out.println("id: "+sup.get());
		
		Supplier<Student> sup1 = Student::create;
		System.out.println("Student : "+sup1.get());
		
		Supplier<List<Student>> sup2= Student::createlist;
		System.out.println("List :"+sup2.get());
		
	}

}


class Student{
	
	static int id;
	String name;
	
	public static int displayid(){
		
		return id;
	}
	
	public static Student create() {
		return new Student();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public static List<Student> createlist(){
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		
		
		return list;
		
		
	}
	
}