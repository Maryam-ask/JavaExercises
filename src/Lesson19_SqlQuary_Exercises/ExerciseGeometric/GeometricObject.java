package Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 10:06 PM
 * Project: IntelliJ IDEA
 */
public abstract class GeometricObject {

    private double side;

    public GeometricObject(){}

    public GeometricObject(double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public abstract double area();
    public abstract double perimeter();

}
