package org.qainsights.animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getNameAndAge() {
        return name + getAge();
    }

    public void setName(String newName) {
        name = newName;
    }

    private int getAge() {
        return 1;
    }
}
