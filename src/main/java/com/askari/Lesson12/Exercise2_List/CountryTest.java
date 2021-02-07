package com.askari.Lesson12.Exercise2_List;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 12/9/2020
 * Time: 8:56 PM
 * Project: IntelliJ IDEA
 */
public class CountryTest {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        CountryFile c = new CountryFile();
        System.out.println("Write the file name? ");
        String fileName = scr.nextLine();
        String[][] file = c.redFile(fileName);
        int countTrue = 0;
        int countFalse = 0;

        for (int j = 0; j < file.length; j++) {

            //System.out.println(file[j][0] + " : " + file[j][1]);
            System.out.println("Enter " + file[j][0] + " capital city: ");
            String input = scr.nextLine();
            if (c.showCountry(input, file[j][1])) {
                System.out.println("Javabet doroste damet garm!");
                countTrue++;
            }else {
                System.out.println("ooooooh!!!!!");
                System.out.println("Bebin yad begir: "+file[j][1]);
                countFalse++;
            }
        }
        System.out.println("True answers: "+countTrue);
        System.out.println("False answers: "+countFalse);
    }
}
