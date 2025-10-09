package org.qainsights.arraysdemo;

public class Dog {
    String name;
    String color;
    private static final String price = "10";

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void getPrice() {
        System.out.println("Dog's price is " + price);
    }

}
