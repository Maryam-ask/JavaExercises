package com.askari.JavaExercises.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 12:33 PM
 * Project: IntelliJ IDEA
 */
public class Train extends Vehicle {

    private int numberOfWagons;

    public Train(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }


    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String printMe() {
        return "Train info:\n" + "Weight: " + getWeight() + " Speed: " + getSpeed() + " Number of wagon: " + getNumberOfWagons();
    }
}
