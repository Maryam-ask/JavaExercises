package com.askari.Lesson19_SqlQuary_Exercises.GeometricExerciseWithScanner;

import com.askari.Lesson19_SqlQuary_Exercises.NewExercise.Circle;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 1/12/2021
 * Time: 2:14 PM
 * Project: IntelliJ IDEA
 */
public class TestMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean c = true;
        while (c) {
            System.out.println("Enter your Geometric object: (circle / cylindrical / square / rectangle) ");
            String gOInput = input.next();
            if (gOInput.toLowerCase().equals("circle")) {

                Circle circle = new Circle();

                System.out.println("Enter the radius(r) for the circle: ");
                int radius = input.nextInt();
                System.out.println("The Area for the circle with radius " + radius + " is: " + circle.area(radius));
                System.out.println("The Perimeter for the circle with radius " + radius + " is: " + circle.perimeter(radius));

            }else if(gOInput.toLowerCase().equals("cylindrical")){

                Cylindrical cylindrical = new Cylindrical();

                System.out.println("Enter the radius(r) for the cylindrical: ");
                int radiusCy = input.nextInt();
                System.out.println("Enter the high(h) for the cylindrical: ");
                int highCy = input.nextInt();
                System.out.println("The Area for the circle with radius " + radiusCy+" and high "+highCy +
                        " is: " + cylindrical.area(radiusCy,highCy));
                System.out.println("The Volume for the circle with radius " + radiusCy+" and high "+highCy +
                        " is: " + cylindrical.volume(radiusCy,highCy));
                System.out.println("The Total Volume for the circle with radius " + radiusCy+" and high "+highCy +
                        " is: " + cylindrical.totalVolume(radiusCy,highCy));

            }else if (gOInput.toLowerCase().equals("square")){

                Square square = new Square();
                System.out.println("Enter the side(s) for the square: ");
                int side = input.nextInt();
                System.out.println("The Area for the square with side "+side+" is: "+square.area(side));
                System.out.println("The Perimeter for the square with side "+side+" is: "+square.perimeter(side));

            }else if (gOInput.toLowerCase().equals("rectangle")){

                Rectangle rectangle = new Rectangle();
                System.out.println("Enter the side1(s1) for the square: ");
                int side1 = input.nextInt();
                System.out.println("Enter the side2(s2) for the square: ");
                int side2 = input.nextInt();
                System.out.println("The Area for the rectangle with side1 "+side1+" and side2 "+side2
                        +" is: "+rectangle.area(side1,side2));
                System.out.println("The Perimeter for the rectangle with side1 "+side1+" and side2 "+side2
                        +" is: "+rectangle.perimeter(side1,side2));

            }

            System.out.println("Do you want to continue? (yes,No)");
            String edame = input.next();
            if (edame.equals("no")) {
                c = false;
                break;
            }
            System.out.println("*******************************");
        }
    }
}
