package org.qainsights.animal;

import org.qainsights.operatorsdemo.OperatorsDemo;

class AnimalDriver {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Animal a = new Animal("Cat");
        System.out.println(a.getNameAndAge());
        OperatorsDemo o = new OperatorsDemo();
        System.out.println(o.getTypeOf(a));
        String name = "";
        System.out.println(o.getTypeOf(name));
    }
}