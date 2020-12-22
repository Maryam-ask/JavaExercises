package Lesson1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/8/2020
 * Time: 12:54 PM
 * Project: IntelliJ IDEA
 */
public class Model {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many row should be written: ");
        int rows = sc.nextInt();
        for (int i=1; i<=rows;i++){
            for (int j=0; j<i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
