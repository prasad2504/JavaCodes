import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo3 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //foreachloop
        for(String fruit:list)
        	System.out.println(fruit);
    }
}
