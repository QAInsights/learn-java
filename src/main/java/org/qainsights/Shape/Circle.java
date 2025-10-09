package org.qainsights.shape;

public class Circle {

    int x;
    int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void rotate() {
        System.out.println("Rotating Circle" + "x: " + x + " y: " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
