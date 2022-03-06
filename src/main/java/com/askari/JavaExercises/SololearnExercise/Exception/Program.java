package com.askari.JavaExercises.SololearnExercise.Exception;

/**
 * Created by Maryam Askari
 * Date: 5/9/2021
 * Time: 8:07 PM
 * Project: IntelliJ IDEA
 */
public class Program {


    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }


}
