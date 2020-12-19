package Lesson15_THREAD.LessonC;

/**
 * Created by Maryam Askari
 * Date: 12/15/2020
 * Time: 4:00 PM
 * Project: IntelliJ IDEA
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Started::"+Thread.currentThread().getName());// Baraye gereftane esme Thread

        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread Ended::"+Thread.currentThread().getName());
    }
}
