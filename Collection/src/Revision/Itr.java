package Revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itr {
	
	public static void main(String[] args) {
		
		
		List<Student> l1 = new ArrayList<Student>();
		
		l1.add(new Student(1,"prasad"));
		l1.add(new Student(2,"riyuuu"));
		
		
		
		Iterator<Student> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}


class Student {
	int no;
	String name;
	
	
	public Student (int no , String name) {
		
		this.no=no;
		this.name=name;
	}
	
	public String toString() {
		return "no:"+no + " name:"+name;
	}
}