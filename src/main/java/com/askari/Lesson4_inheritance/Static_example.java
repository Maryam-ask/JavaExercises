package com.askari.Lesson4_inheritance;

/**
 * Created by Maryam Askari
 * Date: 12/20/2021
 * Time: 7:24 PM
 * Project: IntelliJ IDEA
 */
public class Static_example {
    private Cat name(){
        System.out.println(Vahed.SEK);
        return new Cat("ali", 12, 23.76);
    }
    public static class Cat{
        public final String name;
        public final Integer age;
        private final Double cost;
        public Cat(String name, int age, double cost){
            this.name = name;
            this.age = age;
            this.cost = cost;
        }
    }

    public static enum Vahed{
        SEK,
        USD
    }
    public static void main(String[] args) {
        Static_example st = new Static_example();
        System.out.println(st.name());
    }
}


