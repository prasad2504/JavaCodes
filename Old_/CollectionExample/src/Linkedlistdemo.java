import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
//		list1.addLast(25);
//		list1.addFirst(5);
		list1.add(20);
		list1.add(6);
		
		list1.addAll(list1);
		
		System.out.println(list1);
	}
}
