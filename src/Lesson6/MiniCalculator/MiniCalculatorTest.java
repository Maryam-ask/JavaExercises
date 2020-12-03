package Lesson6.MiniCalculator;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 11/19/2020
 * Time: 12:56 PM
 * Project: IntelliJ IDEA
 */
public class MiniCalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        int number1, number2;
        String operand;
        System.out.println("Enter your first number:");
        number1 = input.nextInt();
        System.out.println("Enter your second number:");
        number2 = input.nextInt();
        System.out.println("Enter your Operand");
        operand = input.next();
        if (operand.equals("+"))
            System.out.println("The result is: " + calculator.sum(number1,number2));
        else if(operand.equals("-"))
            System.out.println("The result is: "+calculator.minus(number1,number2));
        else if (operand.equals("*"))
            System.out.println("The result is: "+calculator.multiplication(number1,number2));
        else if (operand.equals("/"))
            System.out.println("The result is: "+calculator.division(number1,number2));
    }
}
