package Lesson18_InnerClass_bubbleSort_WaiteThread.WaitNotify;

/**
 * Created by Maryam Askari
 * Date: 12/30/2020
 * Time: 1:20 PM
 * Project: IntelliJ IDEA
 */
public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("Emshab dar sar shori darammmmmmmmm");

        Waiter waiter = new Waiter(msg);
        Thread thread = new Thread(waiter,("WaiterThread 1"));
        thread.start();

        //........................

        Waiter waiter1 = new Waiter(msg);
        Thread thread1 = new Thread(waiter1,("WaiterThread 2"));
        thread1.start();

        //.........................

        Notifier notifier = new Notifier(msg);
        Thread thread2 = new Thread(notifier,("Notifier"));
        thread2.start();
        // Notify faghat yek thread ra azad mikonada va thread dovom hanooz azad nashode!
        // Zamani ke ma 2 ta Thred Wait misazim baraye yek object baraye azad kardaneshan niz be 2 ta Thred Notify niaz darim!
        // dar gheire in sorat mitavan az methode notifyAll() dar Threade Notifier estefade kard.

        System.out.println("All threads are started............");

    }
}
