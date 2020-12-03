package Lesson7;

import java.io.Serializable;

/**
 * Created by Maryam Askari
 * Date: 11/21/2020
 * Time: 1:08 PM
 * Project: IntelliJ IDEA
 */
public class Marzieh implements Serializable { // Using serializable interface for serialization.

    private String name;
    private int age;

    public Marzieh(){
        System.out.println("Ana Marzieh constructor");
    }

    public Marzieh(String name, int age){
        System.out.println("Ana constructor..........");
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
