package Lesson1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 10/29/2020
 * Time: 9:34 AM
 * Project: IntelliJ IDEA
 */
public class Palindrome {
    public Palindrome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word for checking palindrome:");
        String word = sc.nextLine();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println(word);
        } else {
            System.out.println("Your word is not palindrome!");
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
    }
}
