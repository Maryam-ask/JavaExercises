package Lesson16_Synchronized.Exercise1;

import Lesson15_THREAD.LessonB.ProcessThread;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 12:33 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Lesson15_THREAD.LessonB.ProcessThread processThread = new ProcessThread();

        Thread thread1 = new Thread(processThread);
        thread1.start();

        Thread thread2 = new Thread(processThread);
        thread2.start();

        //thread1.join(); // thread1 vaise ta threade asli karesh tamoom beshe.

        System.out.println("ProcessThreadSync.getCount:: " + processThread.getCount());

        //thread2.join();

        System.out.println("ProcessThreadSync.getCount:: " + processThread.getCount());
    }
}
