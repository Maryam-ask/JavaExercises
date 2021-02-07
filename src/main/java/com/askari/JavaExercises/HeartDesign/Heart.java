package com.askari.JavaExercises.HeartDesign;

/**
 * Created by Maryam Askari
 * Date: 12/22/2020
 * Time: 2:47 PM
 * Project: IntelliJ IDEA
 */
public class Heart {
    public static void main(String[] args) {

        int size = 10;
        int counter =0;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j <= 4 * size; j++) {

                double d1 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - size, 2));
                double d2 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - 3 * size, 2));

                if (d1 < size + 0.5 || d2 < size + 0.5) {
                   //System.out.printf("\uD83D\uDC8B"); // Kiss
                   System.out.printf("\uD83E\uDDE1"); // Heart
                    counter++;
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 1; i < 2 * size; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("  ");
            for (int z = 0; z < 4 * size + 1 - 3 * i; z++) {
                //System.out.printf("\uD83D\uDC8B"); // Kiss
                System.out.printf("\uD83E\uDDE1"); // Heart
                counter++;
            }
            System.out.println();
        }
        System.out.println("Number of haerts: "+counter);

    }
}
