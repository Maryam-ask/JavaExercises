package com.askari.Lesson19_SqlQuary_Exercises.NewExercise;

/**
 * Created by Maryam Askari
 * Date: 1/9/2021
 * Time: 9:37 PM
 * Project: IntelliJ IDEA
 */
public class Rectangle extends DobodiObjects{

    private double side1;
    private double side2;

    @Override
    public double perimeter() {

        return 2*(side2+side1);
    }

    public double perimeter(double side1, double side2){
        this.setSide1(side1);
        this.setSide2(side2);
        return this.perimeter();
    }

    @Override
    public double area() {
        return side1*side2;
    }

    public double area(double side1,double side2){
        this.setSide1(side1);
        this.setSide2(side2);
        return this.area();
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
}
