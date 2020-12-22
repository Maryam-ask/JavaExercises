package Lesson16_Synchronized;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 12:21 PM
 * Project: IntelliJ IDEA
 */
public class TestSync {

    Integer t=0;

    public static void main(String[] args) {
        TestSync testSync = new TestSync();
        Thread th1 = new Thread(){
            public void run(){
                testSync.test();
            }
        };
        th1.start();

        Thread th2 = new Thread(){
          public void run(){
              testSync.test();
          }
        };
        th2.start();
    }

    public void test(){
        System.out.println("Salam......");

        // Synchronized : ghesmati ke seen kardim faghat tavasote yek Thread anjam shavad.
        // Baraye iemeni kardan Thread ha...
        synchronized (this){  // This --> Object jary dar class ra sync mikonad.
            t++;
        }
        System.out.println("in test method: "+t);
    }
}
