package Lesson19.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 9:22 PM
 * Project: IntelliJ IDEA
 */
public class Circle extends GeometricObject { //?

    private final double pi = Math.PI;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r=r;
    }

    @Override
    public double perimeter() {
        return 2 * r * pi;
    }

    @Override
    public double area() {
        return Math.pow(r, 2) * pi;
    }

    public double getR (){
        return r;
    }
}
