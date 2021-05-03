package com.askari.JavaExercises.andras;

import java.util.Scanner;

/**
 * Created by Andras Vinter
 * Date: 2/17/2021
 * Time: 3:33 PM
 * Project: IntelliJ IDEA
 */
public class Myclass { // Input & output from console: Terminal window:
    public static void main(String[] args) {
        System.out.print("Write your name: ");
        Scanner name = new Scanner(System.in);
        String nameScanner = name.nextLine();
        for(int i=0; i<100; i++) {
            System.out.printf("I " +"\u2665 "+ nameScanner + "\n");
        }
    }
}
