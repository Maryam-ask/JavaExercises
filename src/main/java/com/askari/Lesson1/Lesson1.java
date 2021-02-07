package com.askari.Lesson1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 10/27/2020
 * Time: 6:34 PM
 * Project: IntelliJ IDEA
 */
public class Lesson1 {

    public static void textSplit() {

        String text = "Maryam dokhtare khobi hast. She is good";
        String[] text2 = text.split(" "); // baraye joda kardan az" " (Space) Split() be ma yek array midahad.
        for (String a : text2){ // Halgheye for-each
            System.out.println("Mrs "+a); // ebtedaye har kalame "Mrs" begozarad.
        }
    }

    public static void palindrome(String s){
        String revers="";

        for (int i=s.length()-1 ; i>=0;i--){  //Az enteha shoro be khandan mikonad.
            revers+=s.charAt(i);
        }
        if (s.equals(revers)){  //Method .equals() baraye barresie barabarie ya tasavi
            System.out.println(s);
        }else {
            System.out.println("Your word is not palindrome");
        }
    }


    public static void reverseNumber(int a , int b){
        System.out.print("the reverse of number "+a+" and "+b+" is: ");
        int c=0;
        c=b;
        b=a;
        a=c;
        System.out.println("new a= "+a+" new b= "+b);

    }

    public static int maxOfTreeNumber(){
        int [] array ={10,6,8};
        int max=0;
        for (int i=0;i<array.length;i++){
            max=Math.max(array[i],max);
        }
        return max;
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("1.--------------------------------------------");
        textSplit();

        System.out.println("2.--------------------------------------------");

        System.out.println("Write your word for palindrome:");
        String word = input.nextLine();
        palindrome(word);

        System.out.println("3.--------------------------------------------");
        System.out.println("Enter your first number: ");
        int a =input.nextInt();
        System.out.println("Enter your second number: ");
        int b = input.nextInt();
        reverseNumber(a,b);

        System.out.println("4.--------------------------------------------");
        System.out.println("The maximum value of your tree numbers is: "+maxOfTreeNumber());

    }
}
