package com.askari.JavaExercises.SololearnExercise;

/**
 * Created by Maryam Askari
 * Date: 5/9/2021
 * Time: 7:46 PM
 * Project: IntelliJ IDEA
 */
public class Square extends Shape {

    public Square(int width) {
        this.width=width;
    }

    @Override
    void area() {
        System.out.println(width*width);
    }
}
