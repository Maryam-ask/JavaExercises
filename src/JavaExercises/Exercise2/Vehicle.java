package JavaExercises.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 12:24 PM
 * Project: IntelliJ IDEA
 */
public abstract class Vehicle {

    private int speed;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(int speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public int speedChange(int newSpeed) {
        this.speed = newSpeed;
        return speed;
    }

    public abstract String printMe();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
