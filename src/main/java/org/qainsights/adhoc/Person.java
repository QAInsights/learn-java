package org.qainsights.adhoc;

import java.util.Arrays;

class Person {
    private int id;
    private String name;
    private java.util.Date dob;
    private boolean VIP;

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;
        int id = p2.id;
//        p1.name = args[0];
        System.out.println(p1.getName());
        System.out.println(p1.name + p1.id + p1.dob + p1.VIP);

        Object[] s = new Object[1];
        System.out.println(s.toString());

        System.out.println(Arrays.toString(s));
    }

    public String getName() {
        return name;
    }
}