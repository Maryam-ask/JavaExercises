package com.askari.Lesson18_InnerClass_bubbleSort_WaiteThread.WaitNotify;

/**
 * Created by Maryam Askari
 * Date: 12/30/2020
 * Time: 1:51 PM
 * Project: IntelliJ IDEA
 */
public class Waiter implements Runnable{

    Message msg;

    public Waiter(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        synchronized (msg){
            try {
                System.out.println(name+" Waiting to get notified at time: "+System.currentTimeMillis());
                msg.wait(); // Object ra wait kon ta karam tamam shavad. be Message kari nadashte va faghat an ra motevaghef karde ast
               // msg.wait(1000); // Mitavan az overload wait() estefade kard baraye zaman dehi / ta key montazer vaise
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name+" Waiter thread got notified at time: "+System.currentTimeMillis());

            // Process the message now
            System.out.println(name+" processed: "+msg.getMsg());
        }

    }
}
