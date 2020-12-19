package Lesson6.Exercise1;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/19/2020
 * Time: 12:26 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int id;

        System.out.println("Enter which child do you want? (1 0r 2)");
        int input = sc.nextInt();
        if (input==1){
            Child1 ch1=new Child1();
            System.out.println("Enter child 1 Name: ");
            name=sc.next();
            ch1.setName(name);
            System.out.println("Enter child1 ID: ");
            id=sc.nextInt();
            ch1.setId(id);
            ch1.PrintMe();
        }else if(input==2){
            Child2 ch2 = new Child2();
            System.out.println("Enter child 1 Name: ");
            name=sc.next();
            ch2.setName(name);
            System.out.println("Enter child1 ID: ");
            id=sc.nextInt();
            ch2.setId(id);
            ch2.PrintMe();
        }
    }
}
