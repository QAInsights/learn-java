package org.qainsights.hashcodedemo;

public class HashCodeDemo {

    static void main() {
        HashCodeDemo demo = new HashCodeDemo();
        demo.go();
    }

    private void go() {
        // primitives
        int a = 1;
        int b = 2;

        System.out.println("No hashCode for the primitives");
        System.out.println("There is no hashCode method for the primitives");

        // String
        String name = "nkn";
        String title = "dev";

        System.out.println(name.hashCode()); // 109137
        System.out.println(title.hashCode()); // 99349

        String name1 = "nkn22";
        String name2 = "nkn22";

        System.out.println(name1.hashCode()); // 104882257
        System.out.println(name2.hashCode()); // 104882257
        System.out.println("Both the hashCode for name1 and name2 is identical because the String content is identical");


        // Object
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.hashCode()); // 41359092
        System.out.println(o2.hashCode()); // 149928006
        System.out.println("o1 and o2 has different memory address - so the hashCode will be different");

        System.out.println(o1.hashCode() != o2.hashCode()); // true
        System.out.println(o1.equals(o2)); // false

    }
}
