package com.askari.Lesson22_MVC.model.to;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 1:50 PM
 * Project: IntelliJ IDEA
 */
public class Student {

    private long id;
    private String name;
    private String family;
    private String nationalCode;
    private Integer age;

    // Hamishe baraye class hayeman constructore bedone vorodi ra benevisim.
    public Student(){}

    public Student(long id, String name, String family, String nationalCode, Integer age) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.age = age;
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

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
