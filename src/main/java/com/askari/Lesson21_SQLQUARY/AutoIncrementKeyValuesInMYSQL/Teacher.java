package com.askari.Lesson21_SQLQUARY.AutoIncrementKeyValuesInMYSQL;

import java.lang.annotation.Target;
import java.util.LongSummaryStatistics;

/**
 * Created by Maryam Askari
 * Date: 5/28/2021
 * Time: 1:29 PM
 * Project: IntelliJ IDEA
 */
public class Teacher {

    private long id;
    private String name;
    private String family;
    private String subject;
    private String phone;
    private String address;
    private int age;

    public Teacher(){}

    public Teacher(String name, String family, String subject,
                   String phone, String address, int age) {
        this.name = name;
        this.family = family;
        this.subject = subject;
        this.phone = phone;
        this.address = address;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
