package com.askari.Lesson6_Inheritance.Exercise1;

/**
 * Created by Maryam Askari
 * Date: 11/19/2020
 * Time: 12:18 PM
 * Project: IntelliJ IDEA
 */
public class Parent {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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