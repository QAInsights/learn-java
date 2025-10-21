package org.qainsights.inheritancedemo;

public class Tiger extends Wild {

    public Tiger() {
        super();
        System.out.println("From the sub class of Tiger");
    }

    @Override
    public void canHunt() {
        System.out.println("Tigers can Hunt and also do not eat grass");
    }

    @Override
    public void roam() {
        super.roam(); // Prints from Animals class
        System.out.println("Tigers can roam and do not eat grass");
    }

}
