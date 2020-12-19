package Lesson15_THREAD.LessonB;

/**
 * Created by Maryam Askari
 * Date: 12/15/2020
 * Time: 2:07 PM
 * Project: IntelliJ IDEA
 */
public class ProcessThread implements Runnable {

    //*********** In class ThreadSafe nist.***********

    private int count; // State less: yani ye staty ra barname negah midarad va zamini ke az an Object besazim mitavanad az an state stefade konad.

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void processSomthing(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    @Override
    public void run() {

        for (int i=0;i<5;i++){
            processSomthing(i);
            System.out.println(i+"------>"+count);
            count++;
        }
        System.out.println(count);
        System.out.println("******************");
    }
}
