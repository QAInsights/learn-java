package org.qainsights.animal;

class AnimalDriver {
    static void main() {
        IO.println("Hello World");
        Animal a = new Animal("Cat");
        IO.println(a.getNameAndAge());
    }
}