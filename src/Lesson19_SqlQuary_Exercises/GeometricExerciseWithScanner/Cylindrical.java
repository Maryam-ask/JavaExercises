package Lesson19_SqlQuary_Exercises.GeometricExerciseWithScanner;

/**
 * Created by Maryam Askari
 * Date: 1/12/2021
 * Time: 2:06 PM
 * Project: IntelliJ IDEA
 */
public class Cylindrical {

    private final double pi = Math.PI;

    public double area(double radius,double high){
        return 2*radius*pi*high;
    }

    public double volume(double radius, double high){
        return Math.pow(radius,2)*pi*high;
    }

    public double totalVolume(double radius, double high){
        return this.area(radius,high)+(2*(Math.pow(radius,2)*pi));
    }
}
