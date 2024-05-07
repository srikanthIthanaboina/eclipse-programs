package in.ChatGptExamples;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Trying to add a duplicate element
        boolean isDuplicateAdded = hashSet.add("Apple");

        System.out.println("Is duplicate added? " + isDuplicateAdded); // Output: false

        // Adding a null element
        hashSet.add(null);

        // Trying to add another null element
        boolean isNullAddedAgain = hashSet.add(null);

        System.out.println("Is null added again? " + isNullAddedAgain); // Output: false

        // Displaying the elements in the HashSet
        System.out.println("HashSet elements: " + hashSet);
    }
}

