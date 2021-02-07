package com.askari.Lesson12.Exercise1;

/**
 * Created by Maryam Askari
 * Date: 12/5/2020
 * Time: 3:50 PM
 * Project: IntelliJ IDEA
 */
public class GeometricObject {
    private double side1=1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public GeometricObject(){}

    public GeometricObject(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
