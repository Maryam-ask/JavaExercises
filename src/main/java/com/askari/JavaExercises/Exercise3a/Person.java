package com.askari.JavaExercises.Exercise3a;

/**
 * Created by Maryam Askari
 * Date: 12/12/2020
 * Time: 1:01 PM
 * Project: IntelliJ IDEA
 */
public class Person {

    private String name;
    private int idNumber;

    public Person(){}

    public Person(String name, int idNumber){
        this.name=name;
        this.idNumber=idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
