package JavaExercises.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 12:36 PM
 * Project: IntelliJ IDEA
 */
public class Bike extends Vehicle {

    private int numberOfGear;
    private int gearJustNow;

    public Bike(int numberOfGear, int gearJustNow) {
        this.numberOfGear = numberOfGear;
        this.gearJustNow = gearJustNow;
    }

    public int switchGear(int newGear) {
        this.gearJustNow = newGear;
        return gearJustNow;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void setNumberOfGear(int numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    public int getGearJustNow() {
        return gearJustNow;
    }

    public void setGearJustNow(int gearJustNow) {
        this.gearJustNow = gearJustNow;
    }

    @Override
    public String printMe() {
        return "Bike info:\n" + "Weight: " + getWeight() + " Speed: " + getSpeed() + " Number of gear: " + getNumberOfGear() +
                " Gear just now: " + getGearJustNow();
    }
}
