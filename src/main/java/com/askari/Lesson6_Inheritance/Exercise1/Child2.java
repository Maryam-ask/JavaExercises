package com.askari.Lesson6_Inheritance.Exercise1;

/**
 * Created by Maryam Askari
 * Date: 11/19/2020
 * Time: 12:23 PM
 * Project: IntelliJ IDEA
 */
public class Child2 extends Parent implements IPrintMe {



    @Override
    public void PrintMe() {
        System.out.println("Child 2: "+"My Id: "+getId()+" My Name: "+getName());
    }
}
