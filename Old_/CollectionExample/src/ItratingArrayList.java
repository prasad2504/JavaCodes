import java.util.*;

public class ItratingArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Creating ArrayList
        list.add("prasad");
        list.add("shreyash");
        list.add("shivam");
        list.add("suraj");

        System.out.println("Traversing list through List Iterator:");
        // Creating ListIterator and setting it to the end of the list
        ListIterator<String> list1 = list.listIterator(list.size());

        // Traversing in reverse order
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }

        System.out.println("Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}