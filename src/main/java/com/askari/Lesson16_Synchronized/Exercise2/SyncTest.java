package com.askari.Lesson16_Synchronized.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 1:33 PM
 * Project: IntelliJ IDEA
 */
public class SyncTest {
    public static void main(String[] args) {

        ThreadSyncTest th1 = new ThreadSyncTest();


        /*Thread t1 = new Thread(new ThreadSyncTest(),"Thread1"); // Harbar yek Objecte jadid misaze dar in sorat ziad tasiri nadarad sync
        Thread t2 = new Thread(new ThreadSyncTest(),"Thread2");
        Thread t3 = new Thread(new ThreadSyncTest(),"Thread3");*/


        Thread t1 = new Thread(th1,"Thread1");
        Thread t2 = new Thread(th1,"Thread2");
        Thread t3 = new Thread(th1,"Thread3");



        t1.start();
        t2.start();
        t3.start();

    }
}
