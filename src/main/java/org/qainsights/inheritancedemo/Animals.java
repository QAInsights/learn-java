package org.qainsights.inheritancedemo;

abstract public class Animals {

    public String name;
    private int age;

    abstract public void move();

    public void roam() {
        System.out.println("Roaming freely from Animals class");
    }

    public void canHunt() {
        System.out.println("It depends on the Animals class");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
