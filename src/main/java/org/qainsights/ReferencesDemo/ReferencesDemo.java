package org.qainsights.referencesdemo;

public class ReferencesDemo {
    static void main() {

        Book a = new Book("a", 1);
        Book b = new Book("b", 2);
        Book c = new Book();
        c = b;
        b = c;
        // int z = c; // this will error out
        System.out.println(c.name + c.price);

        System.out.println(c.hashCode()); // same obj hash
        System.out.println(b.hashCode()); // same obj hash
        System.out.println(a.hashCode()); // different obj hash

    }
}
