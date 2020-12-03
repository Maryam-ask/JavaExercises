package Lesson10;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 11/27/2020
 * Time: 7:47 PM
 * Project: IntelliJ IDEA
 */
public class GymTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java_Home(training)\\File\\Customers.txt");
        Gym gym = new Gym();
        List<Person> f = gym.readFile(file);
        for (Person a : f) {
            System.out.println(a.getFullName());
            System.out.println(a.getIdNumber());
            System.out.println(a.getDate());
        }
    }
}
