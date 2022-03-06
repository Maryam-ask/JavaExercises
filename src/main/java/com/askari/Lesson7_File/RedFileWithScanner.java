package com.askari.Lesson7_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 6/21/2021
 * Time: 8:31 PM
 * Project: IntelliJ IDEA
 */
public class RedFileWithScanner {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java_Home(training)\\File\\sample.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();

        }catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
            e.getCause();
        }
    }
}
