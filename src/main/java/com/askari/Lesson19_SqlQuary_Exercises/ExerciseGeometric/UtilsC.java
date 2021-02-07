package com.askari.Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/6/2021
 * Time: 10:33 AM
 * Project: IntelliJ IDEA
 */
public class UtilsC {

    private final double pi = Math.PI;


    public UtilsC(){}



    public double area(double radius){
        return Math.pow(radius,2)*pi;
    }

    public double perimeter(double radius){
        return 2*pi*radius;
    }

}
