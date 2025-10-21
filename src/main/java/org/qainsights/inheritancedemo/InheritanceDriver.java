package org.qainsights.inheritancedemo;


public class InheritanceDriver {

    public static void main(String[] args) {
        System.out.println("InheritanceDriver starting");

        Cat c = new Cat();
        System.out.println(c.canAdopt);
        c.roam();
        c.setAge(11);
        c.setName("Catty");
        System.out.println(c.getName() + " is " + c.getAge() + " years old");

        Tiger t = new Tiger();
        System.out.println(t.canAdopt);
        t.roam();

        System.out.println("Polymorphism Demo");

        Animals a = new Cat();
        a.name = "PolyCat";
        a.setAge(11);
        a.roam();
        a.canHunt();
        System.out.println(a.name + " is " + a.getAge() + " years old");

        Animals d = new Tiger();
        d.name = "Tiger PolyCat";
        d.setAge(11);
        d.roam();
        System.out.println(d.name + " is " + d.getAge() + " years old");


    }
}
