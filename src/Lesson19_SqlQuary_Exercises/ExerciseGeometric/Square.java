package Lesson19_SqlQuary_Exercises.ExerciseGeometric;

/**
 * Created by Maryam Askari
 * Date: 1/4/2021
 * Time: 10:04 PM
 * Project: IntelliJ IDEA
 */
public class Square extends GeometricObject{

    public Square(double a){
        super(a);
    }

    @Override
    public double area(){
        return Math.pow(getSide(),2);
    }

    @Override
    public double perimeter() {
        return 4*getSide();
    }
}
