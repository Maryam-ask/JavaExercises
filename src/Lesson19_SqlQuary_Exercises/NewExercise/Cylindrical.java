package Lesson19_SqlQuary_Exercises.NewExercise;

/**
 * Created by Maryam Askari
 * Date: 1/9/2021
 * Time: 9:40 PM
 * Project: IntelliJ IDEA
 */
public class Cylindrical extends SebodiObjects{

    private final double pi = Math.PI;
    private double radius;
    private double high;

    @Override
    public double volume() {
        return Math.pow(radius,2)*pi*high;
    }

    public double volume(Circle circle, double high){
        return circle.area()*high;
    }

    public double volume(double radius, double high){
        this.setHigh(high);
        this.setRadius(radius);
        return this.volume();
    }

    @Override
    public double area() {
        return radius*pi*2*high;
    }

    public double area(Circle circle, double high){
        return circle.perimeter()*high;
    }

    public double area(double radius, double high){
        this.setHigh(high);
        this.setRadius(radius);
        return this.area() ;
    }

    public double totalArea(){
        return this.area()+(2*(Math.pow(radius,2)*pi));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
