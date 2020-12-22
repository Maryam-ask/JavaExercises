package Lesson16_Synchronized.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 1:33 PM
 * Project: IntelliJ IDEA
 */
public class SyncTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadSyncTest(),"Thread1");
        Thread t2 = new Thread(new ThreadSyncTest(),"Thread2");
        Thread t3 = new Thread(new ThreadSyncTest(),"Thread3");

        t1.start();
        t2.start();
        t3.start();

    }
}
