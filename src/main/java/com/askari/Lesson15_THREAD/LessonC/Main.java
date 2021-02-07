package com.askari.Lesson15_THREAD.LessonC;

/**
 * Created by Maryam Askari
 * Date: 12/15/2020
 * Time: 4:04 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyRunnable(),"t1");
        Thread thread2 = new Thread(new MyRunnable(),"t2");
        Thread thread3 = new Thread(new MyRunnable(),"t3");

        thread1.start();
        //Join : Sbar kon ta karemon tamom beshe.
        thread1.join(5000); // agar kamtar az Sleep dar MyRunnable bashad yani join karash ra anjam midahad va rad mishavad.
        // Modat zamane ejra shodane t1 ra taien mikonad yani bayad t1 in meghdar sabr konad va bad be khate badi yani t2 beravad.

        thread2.start();
        thread3.start();

    }
}
