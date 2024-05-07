package in.ChatGptExamples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements to the list
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Creating an iterator
        Iterator<String> iterator = list.iterator();

        // Iterating over the elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Modifying the list during iteration
            list.add("New Element"); // This modification won't affect the iterator
        }
    }
}

