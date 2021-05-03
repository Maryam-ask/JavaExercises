package com.askari.Lesson36_Annotation;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 2:35 PM
 * Project: IntelliJ IDEA
 */
public class Dog extends Animal {

    @Override
    public void eatSomeThing() {
        System.out.println("eatSomeThing in Dog class. It is'nt ovverride");
    }
}
