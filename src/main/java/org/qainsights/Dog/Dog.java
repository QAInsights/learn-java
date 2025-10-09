package org.qainsights.dog;

public class Dog {
    private int numberOfBarks;
    private String name;


    public Dog(int numberOfBarks) {
        this.numberOfBarks = numberOfBarks;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int numberOfBarks, String name) {
        this.numberOfBarks = numberOfBarks;
        this.name = name;
    }

    public Dog() {
    }

    public void setNumberOfBarks(int numberOfBarks) {
        if (numberOfBarks < 0) {
            throw new IllegalArgumentException("Number of barks cannot be negative");
        } else {
            this.numberOfBarks = numberOfBarks;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBarks() {
        return numberOfBarks;
    }

    public String getName() {
        return this.name;
    }

    public void bark() {
        for (int i = 0; i < numberOfBarks; i++) {
            IO.println("Woof..." + "from " + getName());
        }
    }
}
