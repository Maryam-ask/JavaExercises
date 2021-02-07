package com.askari.Lesson15_THREAD;

/**
 * Created by Maryam Askari
 * Date: 12/14/2020
 * Time: 11:04 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MaryamThread maryamThread = new MaryamThread();
        Thread thread = new Thread(maryamThread);
        thread.start();
        thread.join(); // maryamThread ra ejra bekon vali montazer bash ta amaliate methode main anjam beshe bad ejra sho.
        // methode Join roye an methodi ke call shode sabr mikone ta ejra beshe.

        long startTime = System.currentTimeMillis();
        System.out.println("Start Time: " + startTime); // zaman dar an lahze.

        System.out.println("Firstttttt");

        Thread.sleep(2000); // Threade main ra baraye modati motevaghef mikonad.(2sanie)
        // chon ejra shodane Threadha vabaste be ThreadScadule momkene in zaman kamtar ya bishtar shavad.
        // Bastegi be zamane ejraye Thread darad. (Threade maryamThread)
        // Barname khat be khat ejra mishavad va zamani ke be in khat miresad barname 2000 milli sanie motevaghef mishavad.
        //*******************************************

        System.out.println(System.currentTimeMillis() - startTime);

        System.out.println("Secondddddddddddd");
        MarziehThread marziehThread = new MarziehThread();
        marziehThread.start();

        System.out.println("Finishhhhhhhhhhhhhhh");

    }
}
