package Lesson19_SqlQuary_Exercises.NewExercise;

import java.util.PrimitiveIterator;

/**
 * Created by Maryam Askari
 * Date: 1/9/2021
 * Time: 9:33 PM
 * Project: IntelliJ IDEA
 */
public class Circle extends DobodiObjects{

    private final double pi = Math.PI;
    private double radius;

    @Override
    public double perimeter() {
        return radius*pi*2;
    }

    public double perimeter(double radius){
        this.setRadius(radius);
        return this.perimeter();
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*pi;
    }

    public double area(double radius){
        this.setRadius(radius);
        return this.area();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
