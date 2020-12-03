package Lesson1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/22/2020
 * Time: 9:11 PM
 * Project: IntelliJ IDEA
 */
public class ReverseText {
    public static void main(String[] args) {
        System.out.println("Enter your sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String [] words = sentence.split(" ");
        for (int i =(words.length-1) ; i>=0 ; i--){
            System.out.print(words[i]+" ");
        }
    }
}
