package com.askari.Lesson18_InnerClass_bubbleSort_WaiteThread.InnerClass;

/**
 * Created by Maryam Askari
 * Date: 12/30/2020
 * Time: 7:44 PM
 * Project: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {

        Outer.Inner in = new Outer().new Inner();
        in.show();

        Outer outer = new Outer();
        outer.outerMethod();
    }
}
