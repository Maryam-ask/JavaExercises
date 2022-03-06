package com.askari.JavaExercises.SololearnExercise;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 5/9/2021
 * Time: 7:45 PM
 * Project: IntelliJ IDEA
 */
public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
