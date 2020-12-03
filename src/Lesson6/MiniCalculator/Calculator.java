package Lesson6.MiniCalculator;

/**
 * Created by Maryam Askari
 * Date: 11/19/2020
 * Time: 12:44 PM
 * Project: IntelliJ IDEA
 */
public class Calculator implements Interface {


    @Override
    public int sum(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int minus(int number1, int number2) {
        return number1-number2;
    }

    @Override
    public int multiplication(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public double division(int number1, int number2) {
        try{
            return number1/number2;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
