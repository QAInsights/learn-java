package org.qainsights.animal;

import org.qainsights.operatorsdemo.OperatorsDemo;

class AnimalDriver {
    static void main() {
        IO.println("Hello World");
        Animal a = new Animal("Cat");
        IO.println(a.getNameAndAge());
        OperatorsDemo o = new OperatorsDemo();
        System.out.println(o.getTypeOf(a));
        String name = "";
        System.out.println(o.getTypeOf(name));
    }
}