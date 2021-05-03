package com.askari.Lesson35_Java8Interfaces;

import java.util.function.Predicate;

/**
 * Created by Maryam Askari
 * Date: 4/11/2021
 * Time: 4:43 PM
 * Project: IntelliJ IDEA
 */
public class Testpredicate {
    public static void main(String[] args) {
        // Predicate yek method test() darad ke baraye search va inke yek shart ra chek konim khob ast.

        Predicate<Integer> p1 = i->(i>10);
        Predicate<Integer> p2 = i->(i<20);
        //Predicate<Integer> p3 = i->(i<20 && i>10);
        /*
        Mitavanim az Method haye amadeye Predicate stefade konim bejaye khat bala
         */
        Predicate<Integer> p3 = p2.and(p1);
        System.out.println(p3.test(16));
        // Khasiate popline ha :
        boolean b = p2.and(p1).test(16);
        System.out.println(b);

        // Predicate methode Or() niz darad:
        boolean b2 = p2.or(p1).test(30);
        System.out.println(b2);

        System.out.println(p1.test(5));




    }
}
