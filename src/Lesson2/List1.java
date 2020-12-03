package Lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/2/2020
 * Time: 3:04 PM
 * Project: IntelliJ IDEA
 */
public class List1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(5);
        myList.add(22);
        myList.add(80);
        myList.add(7);
        myList.add(14);

        int counterF=0;
        int counterW=0;

        for (int i=0;i<myList.size();i++){
            counterF+=myList.get(i);
        }
        System.out.println("Addition using the for loop: "+counterF);


        int k=0;
        while (k< myList.size()){
            counterW+=myList.get(k);
            k++;
        }
        System.out.println("Addition using the while loop: "+counterW);
    }
}
