package Lesson10.Exercise;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/27/2020
 * Time: 7:47 PM
 * Project: IntelliJ IDEA
 */
public class GymTest {
    public static void main(String[] args){
        Gym gym = new Gym();
        Scanner input = new Scanner(System.in);
        try {
            List<Person> f = gym.readFile();
            System.out.println("Enter your name:");
            String scInput = input.nextLine();
            Person p = gym.checkName(scInput, f);
            if (p != null) {
                System.out.println("?????????");
                if (gym.checkDate(p)) {
                    System.out.println("you are welcome!");
                    System.out.println("What is your plan?");
                    String plan = input.nextLine();
                    gym.creatFile(p, plan);
                    gym.creatReceptionFile(p);
                } else {
                    System.out.println("Person is not allowed to enter the gym.");
                }

            } else {
                System.out.println("Person is not in the list!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
