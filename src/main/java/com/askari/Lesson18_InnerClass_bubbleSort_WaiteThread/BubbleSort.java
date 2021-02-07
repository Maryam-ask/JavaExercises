package com.askari.Lesson18_InnerClass_bubbleSort_WaiteThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 12/30/2020
 * Time: 12:31 PM
 * Project: IntelliJ IDEA
 */
public class BubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?");
        int length = input.nextInt();

        List <Integer> numbers = new ArrayList<Integer>(length);

        int i = 0;
        // Gereftane adad
        while (i !=length){
            System.out.println("Inter your "+(i+1)+" number:");
            int number = input.nextInt();
            numbers.add(i,number);
            i++;
        }



        // Bubble sort
        int helpN =0;
        for (int j= 1 ; j<numbers.size();j++){
            for (int z=1;z<length;z++){
                if (numbers.get(z-1)>numbers.get(z)){
                    helpN = numbers.get(z-1);
                    numbers.set(z-1,numbers.get(z)); // Bejaye an index Number vared shode ra ezafe mikonad
                    numbers.set(z, helpN);
                }
            }
        }

        System.out.println("the result is: " + numbers);
    }
}
