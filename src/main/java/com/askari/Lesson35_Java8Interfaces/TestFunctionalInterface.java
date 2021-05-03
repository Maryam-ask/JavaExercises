package com.askari.Lesson35_Java8Interfaces;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by Maryam Askari
 * Date: 3/20/2021
 * Time: 8:13 AM
 * Project: IntelliJ IDEA
 */
public class TestFunctionalInterface {
    public static void main(String[] args) {
        // mikhahim ye String begirim
        Supplier<String> supplier1 = () -> "Maryam";
        System.out.println(supplier1.get()); // Methode khode supplier ra seda mizanim.

        //*************************************************************************************

        Supplier<Student> supplier2 = () -> new Student("Maryam", "Askari", 26);
        System.out.println(supplier2.get().getName()); // esme student ra be ma midahad.

        //**************************************************************************************

        // baraye tolide adade random
        Supplier<Integer> supplier3 = () -> new Random().nextInt(10);
        System.out.println(supplier3.get()); // yek adade random ra be ma midahad.

        //**************************************************************************************

        // 1. generate method:
        // 5 adad ra ke supplier be ma midahad ---> khoroji yek list ast.
        Stream.generate(supplier3).limit(5).forEach(System.out::println);

        //**************************************************************************************

        List<String> names = Arrays.asList("Maryam", "Marzieh", "András");

        names.forEach(name -> System.out.println("Ms" + name));
        // names.forEach(System.out::println);

        //***************************************************************************************

        Map<String, Integer> map = new HashMap<>();
        map.put("Maryam", 26);
        map.put("Marzieh", 27);
        map.put("András", 38);

        // halate ghadim ( bedone estefade az java8)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Ba estefade az methode forEach mojod dar streamha dar java8.
        map.forEach((String key, Integer age) -> System.out.println(key + " " + age));

        //*********************************************************************************************

        List<String> names2 = Arrays.asList("Ali", "Nadia", "Mohammad");

        // tamame esmhaye dakhele name2 ra horofe bozorg konad
        names2.replaceAll(name -> name.toUpperCase());
        //names2.replaceAll(String::toUpperCase);

        names2.forEach(System.out::println); // Alan tamame horofe toye list ra uppercase neshan midahad.

        //************************************************************************************************

        BinaryOperator<Student> binaryOperator = (val1, val2) -> {
            val1.setName(val2.getName());
            return val2;
        };

        //************************************************************************************************

        /*
        Yek classe Thread neveshtim va vorodi be an interface Runnable ra dadim,
        Interface Runnable ---> ye Functional ast ke yek methode run() darad.
        ke vorodi hichi nemigirad va khoroji ham hichi nemidahad.
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Saaalaaaaaaaaaam");
            }
        });
        thread.start();

        // Lambdaye ghesmate bala:

        Thread thread1 = new Thread(()-> System.out.println("salaaaaaaaaaaam"));
        thread1.start();

    }
}
