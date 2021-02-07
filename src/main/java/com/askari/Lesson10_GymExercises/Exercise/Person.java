package com.askari.Lesson10_GymExercises.Exercise;

import java.time.LocalDate;

/**
 * Created by Maryam Askari
 * Date: 12/1/2020
 * Time: 4:58 PM
 * Project: IntelliJ IDEA
 */
public class Person {

    private String fullName;
    private String idNumber;
    private LocalDate date;

    Person() {
    }

    public Person(String fullName, String idNumber, LocalDate date) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.date = date;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
