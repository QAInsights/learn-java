package org.qainsights.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogDriver {
    static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.getName());
        System.out.println(d1.getNumberOfBarks());

        d1.setNumberOfBarks(0);
        d1.setName("Dog A");
        d1.bark();

        Dog d2 = new Dog();
        d2.setName("Dog B");
        d2.setNumberOfBarks(3);
        d2.bark();

        int a = 3;
        int b = 3;

        if (a == b)
            System.out.println("true");

        if (d1 == d2)
            System.out.println("true");
        else
            System.out.println("false");

        if (d1.equals(d2))
            System.out.println("true-" + d1.hashCode() + "---" + d2.hashCode());
        else
            System.out.println("false-" + d1.hashCode() + "---" + d2.hashCode());

        Dog d3 = new Dog();
        d3 = d1;
        d3.setName("Dog C");
        System.out.println(d3.getName() + " name is " + d1.getName()); // same name

        if (d3.equals(d1))
            System.out.println("true-" + d3.hashCode() + "---" + d1.hashCode());
        else
            System.out.println("false");

//        String[] fruits = new String[]{"A", "B", "C"};
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple"));
        System.out.println(fruits.getFirst());
    }
}
