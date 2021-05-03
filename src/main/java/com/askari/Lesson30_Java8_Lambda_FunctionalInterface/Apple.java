package com.askari.Lesson30_Java8_Lambda_FunctionalInterface;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 3:53 PM
 * Project: IntelliJ IDEA
 */
public class Apple {

    private String color;
    private Integer wight;

    public Apple(){}

    public Apple(String color, Integer wight) {
        this.color = color;
        this.wight = wight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWight() {
        return wight;
    }

    public void setWight(Integer wight) {
        this.wight = wight;
    }
}
