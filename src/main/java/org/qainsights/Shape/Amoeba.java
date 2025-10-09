package org.qainsights.shape;

public class Amoeba {

    int rotateAxis;
    double centerX;
    double centerY;

    public Amoeba(int rotateAxis, double centerX, double centerY) {
        this.rotateAxis = rotateAxis;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void rotate() {
        System.out.println("Rotating Amoeba " + "Axis: " + rotateAxis);
    }
}
