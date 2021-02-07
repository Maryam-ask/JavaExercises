package com.askari.Lesson23_Reflection;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 5:45 PM
 * Project: IntelliJ IDEA
 */
public class Marzieh {

    public String hairColor;
    private String nameColor;

    public static void a1(){
        System.out.println("I am Static a.");
    }

    private void a2(){
        System.out.println("I am private method a2.");
    }

    public void a(){
        System.out.println("I am a");
    }

    public  String a3(String name,Integer age){
        return name+" :: "+age;
    }

    public String bs(){
        System.out.println("I am String Method bs");
        return "bbbbbbbbbbbb";
    }

    public void b(){
        System.out.println("I am b");
    }

    public void c(){
        System.out.println("I am c");
    }
}
