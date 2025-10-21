package org.qainsights.inheritancedemo;


public class Cat extends Domestic {
    public String name;
    public Animals animal;
    private int age;

    public Cat() {
        super();
    }

    public Cat(Animals animal) {
        this.animal = animal;
    }

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public void roam() {
        System.out.println("Cats like to roam around the house and also outside");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
