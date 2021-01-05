package Lesson19.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 9:12 PM
 * Project: IntelliJ IDEA
 */
public class Cylindrical extends Circle implements Volume{

    private double h;

    Cylindrical(){}

    Cylindrical(double r, double h){
        super(r);
        this.h=h;
    }

    @Override
    public double area(){
        return perimeter()*h;
    }

    @Override
    public double volume() {
        return area()*h;
    }

    public double totalArea(){
        return this.area()+(2*area());
    }
}
