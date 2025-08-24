import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArrayDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> list = new ArrayList<String>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Collections.sort(list);
        //foreachloop
        for(String fruit:list)
        	System.out.println(fruit);
    }
}
