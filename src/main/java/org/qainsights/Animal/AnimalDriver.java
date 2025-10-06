package org.qainsights.Animal;

class AnimalDriver {
    static void main() {
        IO.println("Hello World");
        Animal a = new Animal("Cat");
        IO.println(a.getNameAndAge());
    }
}