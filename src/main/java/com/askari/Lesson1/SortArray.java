package com.askari.Lesson1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 10/28/2020
 * Time: 10:45 AM
 * Project: IntelliJ IDEA
 */
public class SortArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to sort? ");
        int amount = input.nextInt();
        int [] array = new int[amount];
        for (int i=0;i<array.length;i++){
            System.out.println("Enter your "+(i+1)+" number: ");
            array[i]=input.nextInt();
        }

        int reverse = 0;
        for(int j=0;j<array.length;j++){
            for (int i =1; i < array.length; i++) {
                if(array[i]>array[i-1]) {
                    reverse = array[i];
                    array[i]=array[i-1];
                    array[i-1]=reverse;
                }

            }
        }
        for (int a : array)
            System.out.print(a+" ");



        /*int[] array = {10, 17, 8,9,16,20,95,8,13};
        int c = 0;
        int min = Integer.MAX_VALUE;
        int middle=0;
        String max1 = "";
        for(int j=0;j<array.length;j++){
            for (int i =1; i < array.length; i++) {
                if(array[i]>array[i-1]) {
                     c = array[i];
                     array[i]=array[i-1];
                     array[i-1]=c;
                 }
             }
        }
        for (int a : array)
            System.out.print(a+" ");*/


    }
}
