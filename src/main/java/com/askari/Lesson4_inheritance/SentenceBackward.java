package com.askari.Lesson4_inheritance;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/14/2020
 * Time: 4:31 PM
 * Project: IntelliJ IDEA
 */
public class SentenceBackward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your sentence: ");
        String name=sc.nextLine();
        String [] b = name.split(" ");
        for(int i =b.length-1 ; i>=0;i--)
            System.out.println(b[i]);
    }
}
