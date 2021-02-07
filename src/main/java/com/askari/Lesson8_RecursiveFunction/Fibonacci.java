package com.askari.Lesson8_RecursiveFunction;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/24/2020
 * Time: 10:44 AM
 * Project: IntelliJ IDEA
 */
public class Fibonacci {
    public static int fib(int n) { // Bedone tabe bazgashti (Without Recursive Function)

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        for (int a : fib){
            System.out.print(a+" ");
        }
        return fib[n - 1];
    }

    public static int fibonacci(int number) { // Tabe bazgashty (With Recursive Function)

        if (number == 1) {
           return 0;
        } else if (number == 2) {
           return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    public static void fibonacci1(int numbeer){
        for (int i=1 ; i<=numbeer ; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numberIn = input.nextInt();

        System.out.println("The result Without Recursive Function: ");
        fib(numberIn);
        System.out.println("");
        System.out.println("The result With Recursive Function: ");
        fibonacci1(numberIn);
    }
}
