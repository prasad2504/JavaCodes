import java.util.Stack;

public class Stackdemo {
	
	public static void main(String[] args) {
		Stack s1 = new Stack();
		//push method adds the object on top
		//last in first out (LIFO)
		s1.push(12);
		s1.push(50);
		s1.push(25);
		s1.push(75);
		s1.push(85);
		
		System.out.println(s1);
		//last wala remove
		s1.pop();
		System.out.println(s1);
		
		//peek method returns the top object without removing 
		s1.peek();
		System.out.println(s1);
		
		System.out.println("Capacity : "+s1.capacity());
		System.out.println(s1.elementAt(2));
		System.out.println(s1.contains(75));
		System.out.println(s1.contains(5));
		System.out.println(s1.push(5));
		System.out.println(s1.contains(5));
		System.out.println(s1.remove(2));
		System.out.println(s1);
		Stack s2 = (Stack) s1.clone();
		System.out.println(s1.equals(s2));
		System.out.println(s1.indexOf(55));
		System.out.println(s1.subList(1, 3));


		

		
	}

}
