package com.askari.JavaExercises.Exercise2;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 12:53 PM
 * Project: IntelliJ IDEA
 */
public class MainVehicle {

    public static void printVehicleInfo(Vehicle vehicle){
        System.out.println(vehicle.printMe());
    }

    public static void main(String[] args) {

        Car car = new Car(5,2);
        car.setSpeed(240);
        car.setWeight(1600);
        car.switchGear(3);

        Boat boat = new Boat(15000);
        boat.setSpeed(200);
        boat.setWeight(5000);
        boat.turn("Left");

        Train train = new Train(15);
        train.setSpeed(120);
        train.setWeight(2000);

        Bike bike = new Bike(4,3);
        bike.setSpeed(100);
        bike.setWeight(20);
        bike.switchGear(2);

        printVehicleInfo(car);
        printVehicleInfo(boat);
        printVehicleInfo(train);
        printVehicleInfo(bike);

    }
}
