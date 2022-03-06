package com.askari.JavaExercises.SololearnExercise;

/**
 * Created by Maryam Askari
 * Date: 5/9/2021
 * Time: 7:46 PM
 * Project: IntelliJ IDEA
 */
public class Circle extends Shape {
    public Circle(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(width*width*Math.PI);
    }
}
