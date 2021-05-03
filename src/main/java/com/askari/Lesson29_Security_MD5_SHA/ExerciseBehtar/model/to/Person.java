package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.to;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 2:41 PM
 * Project: IntelliJ IDEA
 */
public class Person {

    private long id;
    private String name;
    private String family;
    private int age;
    private String password;

    public Person(){}

    public Person(long id, String name, String family, int age, String password) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.age = age;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
