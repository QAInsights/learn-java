package org.qainsights.lists;

import java.util.ArrayList;
import java.util.List;

class ListDemo {
    static void main() {
        List<String> fruits = new ArrayList<>(List.of("apple", "orange", "banana", "kiwi"));

        fruits.add("watermelon");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("watermelon");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.addFirst("===papaya");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.addLast("papayassss");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.removeLast();
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.removeAll(fruits);
        fruits.add("New one");

        System.out.println(fruits.getFirst());
        System.out.println("Not empty");


    }

}


