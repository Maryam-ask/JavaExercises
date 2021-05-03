package com.askari.Lesson32_Lambda.Exercise;

/**
 * Created by Maryam Askari
 * Date: 3/13/2021
 * Time: 6:03 PM
 * Project: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {
        test1(m->m.getSide1()*4,new Moraba(4,4));
    }

    public static void test1(Mohit mohit,Ashkale2Bodi ashkale2Bodi) {
        System.out.println(mohit.printMohit(ashkale2Bodi));
    }
}
