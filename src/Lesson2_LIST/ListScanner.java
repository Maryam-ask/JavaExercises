package Lesson2_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/2/2020
 * Time: 6:04 PM
 * Project: IntelliJ IDEA
 */
public class ListScanner {


    public static void addition() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to add? ");
        int k = input.nextInt();
        System.out.println("Enter your numbers:");
        int counter=0;
        for (int i=0 ; i<k; i++) {
             list.add(input.nextInt());
             counter+=list.get(i);
        }
        System.out.println("The result is: "+counter);
    }

    public static void main(String[] args) {
        addition();
    }
}
