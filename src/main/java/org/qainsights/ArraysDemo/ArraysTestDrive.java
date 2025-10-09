package org.qainsights.arraysdemo;

public class ArraysTestDrive {
    static void main() {
        int[] ages = new int[10];
        ages[0] = 1;

        for (int i : ages) {
            System.out.println(i);
        }

        String[] names = new String[10];
        names[0] = "J";
        System.out.println(names[0]);
        String[] newNames = names.clone();
        System.out.println(newNames[0]);
        System.out.println(newNames.length);

        String[] colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";

        for (String s : colors) {
            if (s.length() == 3) {
                IO.println(s);
            }
        }

        Dog d = new Dog("AAA", "blue");
        System.out.println(d.color);

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("AAA", "blue");
        dogs[1] = new Dog("AAA", "red");
        dogs[2] = new Dog("AAA", "green");

        System.out.println("Total dogs are " + dogs.length);

        for (Dog eachDog : dogs) {
            IO.println(eachDog.name + " " + eachDog.color + " " + eachDog.hashCode());
            eachDog.getPrice();
        }
    }
}
