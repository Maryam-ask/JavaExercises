package Lesson5_INHERITANCE.Exercise;

/**
 * Created by Maryam Askari
 * Date: 11/17/2020
 * Time: 12:01 PM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent(); // Constructor: Parent
        p1.a(); // Method a : Parent
        p1.b();
        System.out.println("*************************");

        Child1 c1 = new Child1(); // Constructor: Parent - Child1
        c1.a(); // Method a : Child1
        c1.b(); // Method b : Parent
        c1.c();
        System.out.println("*************************");

        Child2 ch1 = new Child2(); // Constructor: Parent - Child2
        ch1.a(); // Method a : Child2
        ch1.b(); // Method b : Parent
        ch1.d();
        System.out.println("*************************");

        Parent p2 = new Child1(); // Constructor: Parent - Child1
        p2.a(); // Method a : Child1
        p2.b(); // Method b : Parent
        System.out.println("*************************");

        Parent p3 = new Child2(); // Constructor: Parent - Child2
        p3.a(); // Method a : Child2
        p3.b(); // Method b : Parent

    }
}
