package com.askari.Lesson30_Java8_Lambda_FunctionalInterface;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 4:45 PM
 * Project: IntelliJ IDEA
 */
public class FindAppleWithWeightAndColor implements ApplePredicate {
    @Override
    public boolean find(Apple apple) {
        return (apple.getColor().equals(ColorConstant.YELLOW) && apple.getWight() > 2);
    }
}
