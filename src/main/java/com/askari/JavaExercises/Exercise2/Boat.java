package com.askari.JavaExercises.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 12:31 PM
 * Project: IntelliJ IDEA
 */
public class Boat extends Vehicle {

    private double deadWeight;

    public Boat(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    public String turn(String turn) {
        return turn;
    }

    public double getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    @Override
    public String printMe() {
        return "Boat info:\n" + "Weight: " + getWeight() + " Speed: " + getSpeed() + " Dead Weight: " + getDeadWeight();
    }
}
