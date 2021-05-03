package com.askari.Lesson35_Java8Interfaces;

/**
 * Created by Maryam Askari
 * Date: 3/20/2021
 * Time: 8:16 AM
 * Project: IntelliJ IDEA
 */
public class Student {
    private String name;
    private String family;
    private int age;

    public Student(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
