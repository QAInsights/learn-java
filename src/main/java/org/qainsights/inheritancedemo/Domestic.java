package org.qainsights.inheritancedemo;

public class Domestic extends Animals {

    public boolean canAdopt = true;

    public void move() {
        System.out.println("It is a domestic");
    }
}
