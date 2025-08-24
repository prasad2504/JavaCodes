import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Use an Iterator to display elements
        Iterator  itr = list.iterator();
        System.out.println("List of fruits:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
