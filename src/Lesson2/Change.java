package Lesson2;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/5/2020
 * Time: 6:35 PM
 * Project: IntelliJ IDEA
 */
public class Change {
    public static void main(String[] args) {
        // To swap two numbers without using a temporary variable.

        /*int a= 12;
        int b= 46;*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
