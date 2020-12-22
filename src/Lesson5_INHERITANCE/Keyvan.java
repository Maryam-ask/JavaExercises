package Lesson5_INHERITANCE;

/**
 * Created by Maryam Askari
 * Date: 11/17/2020
 * Time: 11:43 AM
 * Project: IntelliJ IDEA
 */
public class Keyvan extends Soheil{

    public Keyvan(){
        System.out.println("Keyvan: I am constructor...");
    }

    public void a(){
        super.a();
        System.out.println("Keyvan: I am a...");
    }

    public void k(){
        System.out.println("Keyvan: I am k...");
    }
}
