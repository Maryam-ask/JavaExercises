package Lesson7_File.Exercise1;

import java.io.Serializable;

/**
 * Created by Maryam Askari
 * Date: 11/21/2020
 * Time: 2:17 PM
 * Project: IntelliJ IDEA
 */
public class Person implements Serializable {

    private String name;
    private long idNumber;
    private int age;

    public Person(){
        System.out.println("I am constructor1....");
    }

    public Person(String name,int age,long idNumber){
        System.out.println("I am constructor2.... ");
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String getName(){
        return "Mr "+ name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age= age;
    }

    public long getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(long idNumber){
        this.idNumber=idNumber;
    }

}
