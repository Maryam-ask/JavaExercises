package com.askari.Lesson6_Inheritance.Exercise1;

/**
 * Created by Maryam Askari
 * Date: 11/19/2020
 * Time: 12:19 PM
 * Project: IntelliJ IDEA
 */
public class Child1 extends Parent implements IPrintMe{



    public void method1(){
        System.out.println("Child1 Methoda1");
    }

    @Override
    public void PrintMe() {
        System.out.println("Child 1: "+"My Id: "+getId()+" My Name: "+getName());
    }
}
