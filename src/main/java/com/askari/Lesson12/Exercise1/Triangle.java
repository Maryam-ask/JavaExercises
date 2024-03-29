package com.askari.Lesson12.Exercise1;

/**
 * Created by Maryam Askari
 * Date: 12/5/2020
 * Time: 2:06 PM
 * Project: IntelliJ IDEA
 */
public class Triangle extends GeometricObject {

    private String color;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public double getArea() {
        double p,s;
        p= getPerimeter()/2;
        s=Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
        return s;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return "Triangle: side1=" + getSide1() + " side2=" + getSide2() + " side3=" + getSide3();
    }

    public boolean isTriangle() {
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;
        if (getSide1()<(getSide3()+getSide2())){
            result1 = true;
        }
        if (getSide2()<(getSide1()+getSide3())){
            result2 =true;
        }
        if (getSide3()<(getSide1()+getSide2())) {
            result3 = true;
        }
        return result1 && result2 && result3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
