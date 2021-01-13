package Lesson19_SqlQuary_Exercises.NewExercise;

/**
 * Created by Maryam Askari
 * Date: 1/9/2021
 * Time: 9:36 PM
 * Project: IntelliJ IDEA
 */
public class Square extends DobodiObjects {

    private double side;

    @Override
    public double perimeter() {
        return 4*side;
    }

    public double perimeter(double side){
        this.setSide(side);
        return this.perimeter();
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    public double area(double side){
        this.setSide(side);
        return this.area();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
