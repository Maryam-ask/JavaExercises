package com.askari.Lesson4_inheritance;

/**
 * Created by Maryam Askari
 * Date: 11/11/2020
 * Time: 6:42 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.a();
        p1.b();
        System.out.println("------------------------");

        Parent p2 = new Child();
        p2.a();
        p2.b();

    }
}
