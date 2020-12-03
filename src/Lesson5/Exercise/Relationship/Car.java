package Lesson5.Exercise.Relationship;

/**
 * Created by Maryam Askari
 * Date: 11/17/2020
 * Time: 1:02 PM
 * Project: IntelliJ IDEA
 */
public class Car {
    private String color;
    private int maxSpeed;
    private double weight;

    public void carInfo(){
        System.out.println("Car color: "+color+"\nCar Max Speed: "+maxSpeed+"\nCar Weight: "+weight);
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
}
