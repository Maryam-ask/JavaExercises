package Lesson12.Exercise1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 12/6/2020
 * Time: 2:52 PM
 * Project: IntelliJ IDEA
 */
public class TriangleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number for side1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter your number for side2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter your number for side3: ");
        double side3 = input.nextDouble();

        Triangle t =new Triangle(side1,side2,side3);

        System.out.println("Set Color for triangle");
        t.setColor(input.next());
        System.out.println("Does this triangle exist? "+t.isTriangle());
        System.out.println("The color of triangle is: "+t.getColor());
        System.out.println("Triangle Area: "+t.getArea());
        System.out.println("Triangle Perimeter: "+t.getPerimeter());
        System.out.println(t.toString());

    }
}
