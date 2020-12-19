package Lesson15_THREAD.LessonB;

/**
 * Created by Maryam Askari
 * Date: 12/15/2020
 * Time: 2:13 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        ProcessThread processThread = new ProcessThread();

        Thread thread1 = new Thread(processThread);
        thread1.start();

        Thread thread2 = new Thread(processThread);
        thread2.start();

        //thread1.join(); // thread1 vaise ta threade asli karesh tamoom beshe.

        System.out.println("ProcessThread.getCount:: " + processThread.getCount());

        //thread2.join();

        System.out.println("ProcessThread.getCount:: " + processThread.getCount());
    }
}
