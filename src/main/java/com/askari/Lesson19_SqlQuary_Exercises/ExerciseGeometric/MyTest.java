package com.askari.Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 10:00 PM
 * Project: IntelliJ IDEA
 */
public class MyTest {

    public static void main(String[] args) {

        // an Object of Circle
        Circle circle = new Circle();
        System.out.println("Circle.area() : " + circle.area());
        System.out.println("Circle.perimeter() : " + circle.perimeter());

        //****************************************************************
        // an Object of Cylindrical
        Cylindrical cylindrical = new Cylindrical(3, 4);
        System.out.println("Cylindrical.area() : " + cylindrical.area());
        System.out.println("Cylindrical.volume() : " + cylindrical.volume());
        System.out.println("cylindrical.totalArea() : " + cylindrical.totalArea());

        //****************************************************************
        // an object of Square
        Square square = new Square(2);
        System.out.println("Square.area() : " + square.area());
        System.out.println("Square.perimeter()" + square.perimeter());

        //****************************************************************
        // an object of Rectangle
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("rectangle.area() : " + rectangle.area());
        System.out.println("rectangle.perimeter() : " + rectangle.perimeter());


    }
}
