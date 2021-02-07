package com.askari.Lesson18_InnerClass_bubbleSort_WaiteThread.WaitNotify;

/**
 * Created by Maryam Askari
 * Date: 12/30/2020
 * Time: 2:10 PM
 * Project: IntelliJ IDEA
 */
public class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message msg){
        this.msg=msg;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println("Started : "+name);
        try {
            Thread.sleep(1000);
            synchronized (msg){
                msg.setMsg("Notifier work done "+name); // dar notify ast ke message ra set mikonad
                //msg.notify(); // Message ra bekhan ya azad kon.
                msg.notifyAll(); // baraye inke nakhahim baraye tak take Thread ha notify benevisim az notifyAll() estefade mikonim

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
