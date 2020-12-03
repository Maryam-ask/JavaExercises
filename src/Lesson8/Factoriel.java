package Lesson8;

/**
 * Created by Maryam Askari
 * Date: 11/24/2020
 * Time: 10:37 AM
 * Project: IntelliJ IDEA
 */
public class Factoriel {

    public static int factoriel(int number){
        if(number==1){
            return 1;
        } else
            return number*factoriel(number-1);
    }

    public static void main(String[] args) {
        System.out.println(factoriel(5));
    }
}
