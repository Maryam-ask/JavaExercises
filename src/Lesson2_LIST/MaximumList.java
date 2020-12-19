package Lesson2_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/5/2020
 * Time: 4:35 PM
 * Project: IntelliJ IDEA
 */

public class MaximumList {

    public static void main(String[] args) {
        // A List for getting numbers
        List<Integer> list = new ArrayList<>();
        // A Scanner object for getting input from terminal window.
        Scanner input= new Scanner(System.in);

        System.out.println("Enter how many numbers you want to add to your list:");
        int size= input.nextInt();

        // Inserting numbers in the list
        for (int i=0;i<size;i++){
            System.out.println("Enter your "+(i+1)+" number: ");
            list.add(i,input.nextInt());
        }

        // Max for finding maximum value and adding it to the maximum variable
        int max=0;
        String sort="";

        /* Two for loops for finding maximum value by searching between two elements
        which are close to each other*/
        for (int i=0; i<list.size();i++){
            for (int j=1; j<list.size();j++){
                 if (list.get(j)>list.get(j-1)) {
                    max = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,max);
                }
            }
        }
        // A for each loop for adding the elements in the list to the String variable "sort".
        for (int a:list){
            sort+=a;
        }
        System.out.println(sort);
    }
}
