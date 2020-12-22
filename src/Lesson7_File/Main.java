package Lesson7_File;

import java.io.*;

/**
 * Created by Maryam Askari
 * Date: 11/21/2020
 * Time: 1:15 PM
 * Project: IntelliJ IDEA
 */
public class Main {

    public static void main(String[] args){

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Java_Home(training)\\File\\Marzieh.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Marzieh marzieh1 = (Marzieh) objectInputStream.readObject();
            Marzieh marzieh2 = (Marzieh) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println(marzieh1.getName()+" "+marzieh1.getAge());
            System.out.println(marzieh2.getName()+" "+marzieh2.getAge());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void writeObject(){
        // Sakhtane object
        Marzieh m1 = new Marzieh("Maryam",26);
        Marzieh m2 = new Marzieh("Marzie",27);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java_Home(training)\\File\\Marzieh.txt"); // kaghaz
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // ghalam

            objectOutputStream.writeObject(m1); // Neveshtane object ba ghalam
            objectOutputStream.writeObject(m2);

            objectOutputStream.close(); // bastane ghalam
            fileOutputStream.close(); // bastane kaghaz

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
