package com.askari.Lesson30_Java8_Lambda_FunctionalInterface;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 4:26 PM
 * Project: IntelliJ IDEA
 */
public class FindRedApple implements ApplePredicate{
    @Override
    public boolean find(Apple apple) {
        return apple.getColor().equals(ColorConstant.RED);
    }
}
