package com.askari.Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 10:19 PM
 * Project: IntelliJ IDEA
 */
public class Rectangle extends GeometricObject {

    private double side2;

    public Rectangle(double side1, double side2){
        super(side1);
        this.side2=side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double area() {
        return getSide()*side2;
    }

    @Override
    public double perimeter() {
        return 2*(getSide()+side2);
    }
}
