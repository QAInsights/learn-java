package org.qainsights.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    static void main() {

        // Step 1: Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Step 2: Add some items
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.set(0, "Strawberry");
        System.out.println("Does it contain Mango?" + fruits.contains("Mango"));
        fruits.add("Mango");

        // Step 3: Access an item
        System.out.println("First fruit: " + fruits.get(0));


        // Step 4: Loop through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Step 5: Remove an item
        fruits.remove("Banana");

        // Step 6: Check size
        System.out.println("Now the list has " + fruits.size() + " items.");

    }


}
