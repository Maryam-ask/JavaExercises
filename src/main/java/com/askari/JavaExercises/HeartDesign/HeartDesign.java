package com.askari.JavaExercises.HeartDesign;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 1/5/2021
 * Time: 8:39 PM
 * Project: IntelliJ IDEA
 */
public class HeartDesign {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write the size of your heart: ");
        int n = input.nextInt();
        for (int i=-3*n/2;i<=n;i++){
            for (int j=-3*n/2;j<=3*n/2;j++){

                if ((Math.abs(i)+Math.abs(j)<n)
                        ||( (-n/2-i)*(-n/2-i)+(n/2-j)*(n/2-j)<=n*n/2)
                        ||((-n/2-i)*(-n/2-i)+(-n/2-j)*(-n/2-j)<=n*n/2)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
