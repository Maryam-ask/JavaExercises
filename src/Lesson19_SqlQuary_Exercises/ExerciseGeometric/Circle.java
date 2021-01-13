package Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 9:22 PM
 * Project: IntelliJ IDEA
 */
public class Circle extends GeometricObject { //?


    private double r;
    private UtilsC utilsC = new UtilsC();

    public Circle() {
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return utilsC.perimeter(r);
    }

    @Override
    public double area() {
        return utilsC.area(r);
    }

    public double getR (){
        return r;
    }
}
