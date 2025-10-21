package org.qainsights.inheritancedemo;

public class Wild extends Animals {

    public boolean canAdopt = false;

    public void canHunt() {
        System.out.println("Wild animals can hunt if they want");
    }

    public void move() {
        System.out.println("Wild animals move freely in the wild");
    }
}
