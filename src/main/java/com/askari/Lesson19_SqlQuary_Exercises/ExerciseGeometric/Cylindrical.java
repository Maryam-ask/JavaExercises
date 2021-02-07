package com.askari.Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 9:12 PM
 * Project: IntelliJ IDEA
 */
public class Cylindrical extends GeometricObject implements Volume{

    private double h;

    Cylindrical(){}

    Cylindrical(double r, double h){
        super(r);
        this.h=h;
    }

    @Override
    public double area(){
        return perimeter()*h;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return area()*h;
    }

    public double totalArea(){
        return this.area()+(2*area());
    }
}
