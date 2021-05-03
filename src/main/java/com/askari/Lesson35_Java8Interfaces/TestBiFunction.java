package com.askari.Lesson35_Java8Interfaces;

import java.util.function.BiFunction;

/**
 * Created by Maryam Askari
 * Date: 4/11/2021
 * Time: 4:57 PM
 * Project: IntelliJ IDEA
 */
public class TestBiFunction {
    public static void main(String[] args) {


    /*
    BiFunction ----> (T, U) -> R
    Dota vorodi migirad ba yek khoroji midahad.
     */

        BiFunction<Integer, Integer, Integer> tt1 = (x, y) -> {return x + y;};
        BiFunction<Integer, Integer, Integer> tt2 = (x, y) -> {return x + y;};

        System.out.println(tt2.apply(10,20));

        /*
        BiFunction alave bar inke yek mrthode Abstract darad --> Yek method andThen() darad
        andThen() ---> vorodi yek Function migirad
         */

        tt1=tt1.andThen(a->2*a);
        System.out.println(tt1.apply(2,10));

        // Mitavan yek seri amaliat anjam dad va exception nullpoinetr ra bargardanad.
        tt1 = tt1.andThen(null);
        System.out.println(tt1.apply(2,10));
    }
}