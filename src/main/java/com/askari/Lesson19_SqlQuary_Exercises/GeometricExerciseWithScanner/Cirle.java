package com.askari.Lesson19_SqlQuary_Exercises.GeometricExerciseWithScanner;

/**
 * Created by Maryam Askari
 * Date: 1/12/2021
 * Time: 2:03 PM
 * Project: IntelliJ IDEA
 */
public class Cirle {

    private final double pi = Math.PI;

    public double area(double radius){
        return Math.pow(radius,2)*pi;
    }

    public double perimeter(double radius){
        return radius*2*pi;
    }
}
