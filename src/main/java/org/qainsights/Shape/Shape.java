package org.qainsights.shape;

public class Shape {
    public static void main() {
        Circle c = new Circle(1, 2);
        c.rotate();
        System.out.println("Circling");

        Amoeba z = new Amoeba(1, 1, 1);
        z.rotate();
        System.out.println("Amoeba rotating");

        Amoeba a = new Amoeba(1, 1, 1);
        a.rotate();


        System.out.println("Amoeba rotating");

        if (true) {
            Amoeba z2 = new Amoeba(1, 1, 1);
            z2.rotate();
        }

    }
}
