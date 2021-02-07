package com.askari.Lesson5_INHERITANCE.Exercise.Relationship;

/**
 * Created by Maryam Askari
 * Date: 11/17/2020
 * Time: 1:15 PM
 * Project: IntelliJ IDEA
 */
public class RelationshipDemo {
    public static void main(String[] args) {
        Volvo myVolvo = new Volvo();
        myVolvo.setColor("Black");
        myVolvo.setMaxSpeed(240);
        myVolvo.setWeight(1800);
        myVolvo.carInfo();
        myVolvo.volvoIsStartDemo();
    }
}
