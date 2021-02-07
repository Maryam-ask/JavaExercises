package com.askari.Lesson6_Inheritance;

/**
 * Created by Maryam Askari
 * Date: 11/17/2020
 * Time: 5:04 PM
 * Project: IntelliJ IDEA
 */
public class Parent {
    private int id;
    private String name;

    public Parent(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void method1(){
        System.out.println("Parent Method 1.");
    }

}
