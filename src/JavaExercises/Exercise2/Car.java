package JavaExercises.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 12:27 PM
 * Project: IntelliJ IDEA
 */
public class Car extends Vehicle {

    private int numberGear;
    private int gearJustNow;

    public Car(int numberGear, int gearJustNow) {
        this.numberGear = numberGear;
        this.gearJustNow = gearJustNow;
    }

    public int switchGear(int newGear) {
        this.gearJustNow = newGear;
        return gearJustNow;
    }

    @Override
    public String printMe() {
        return "Car info:\n" +"Wight: " + getWeight() + " Speed: " + getSpeed() + " Number of Gear: " + getNumberGear() + " Gear just now: " + gearJustNow;
    }

    public int getNumberGear() {
        return numberGear;
    }

    public void setNumberGear(int numberGear) {
        this.numberGear = numberGear;
    }

    public int getGearJustNow() {
        return gearJustNow;
    }

    public void setGearJustNow(int gearJustNow) {
        this.gearJustNow = gearJustNow;
    }
}
