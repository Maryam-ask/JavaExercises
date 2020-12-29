package Lesson16_Synchronized.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 1:30 PM
 * Project: IntelliJ IDEA
 */
public class ThreadSyncTest implements Runnable {

    Integer count = 0;

    @Override
    public void run() {
        //synchronized (this) { // This--->objecte Class.... ke inja haman methode clas ast // hamzaman 3 ta thread
        synchronized (count){ // Meghdar count ghofl mishavad va hamzaman nemitavanand taghir dahand.
        System.out.println(Thread.currentThread().getName());

            for (int i = 0; i < 3; i++) {
                count++;
                System.out.println(Thread.currentThread().getName() + " counts:" + count);
            }
            System.out.println(Thread.currentThread().getName() + " counts:" + count);
        }
    }
}
