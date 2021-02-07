package com.askari.Lesson8_RecursiveFunction.Exercise1;

import java.io.File;

/**
 * Created by Maryam Askari
 * Date: 11/24/2020
 * Time: 12:39 PM
 * Project: IntelliJ IDEA
 */
public class DeleteFile {

    public static File file = new File("D:\\Java_Home(training)\\DeleteFile\\Maryam");

    public static void deletFile(File file){
        if (file.isDirectory()) {
            System.out.println("Directoriiiiii");
            File[] file1 = file.listFiles();
            System.out.println(file1.length);
            for (int i = 0; i < file1.length; i++) {
                if(file1[i].isDirectory()) {
                    deletFile(file1[i]);
                }else
                    file1[i].delete();
            }
        }else {
            System.out.println(file.delete());
        }
        System.out.println(file.delete());
    }

    public static void main(String[] args) {
        deletFile(file);
    }
}
