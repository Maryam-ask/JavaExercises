package com.askari.Lesson30_Java8_Lambda_FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 3:56 PM
 * Project: IntelliJ IDEA
 */
public class MaryamTest {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(ColorConstant.GREEN, 10));
        apples.add(new Apple(ColorConstant.RED, 1));
        apples.add(new Apple(ColorConstant.YELLOW, 5));
        apples.add(new Apple(ColorConstant.GREEN, 6));
        apples.add(new Apple(ColorConstant.YELLOW, 3));
        apples.add(new Apple(ColorConstant.RED, 7));
        List<Apple> result = findAppleByPredicate(apples, new FindRedApple());
        System.out.println(result.size());
        List<Apple> result1 = findAppleByPredicate(apples, new FindGreenApple());
        System.out.println(result1.size());

        /*
        Bejaye anke biaiem har kelas ra joda tarif konim mitavanim hamon lahze ke mikhahim estefade konim class ra new konim.
         */
        // Animus class migoiand.
        ApplePredicate applePredicate = new ApplePredicate() {// kholasash : (Apple apple) -> {return (apple.getWight() > 5);}
            @Override
            public boolean find(Apple apple) {
                return (apple.getWight() > 5);
            }
        };
        List<Apple> result2 = findAppleByPredicate(apples, applePredicate);
        System.out.println(result2.size());

        /*
        Lambda :    ------> Manande if va for mimanad
        (Parametre vorodi) -> amaliat
        EX:  () -> {}
             () -> "Result"
             () -> {return "hi";} ---> Zamanike mikhahim retunr konim bayad hatman {} dashte bashim
             (String s) -> {"I love u";} ===> FALSE ====> (String s) -> {return "I love you";}
             faghat baraye FunctionalInterface
         */

        List<Apple> result3 = findAppleByPredicate(apples, (Apple apple) -> {
            return (apple.getWight() > 5);
        });
        System.out.println(result2.size());

        // inja :::: List<Apple> result4 = findAppleByPredicate(apples, (Apple apple) -> {return (apple.getWight() > 5);});


    }


    public static List<Apple> findAppleByPredicate(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : apples) {
            if (applePredicate.find(a)) {
                result.add(a);
            }
        }
        return result;
    }


    public static List<Apple> findAppleByPredicateJDK(List<Apple> apples, Predicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : apples) {
            if (predicate.test(a)) {
                result.add(a);
            }
        }
        return result;
    }


    // Ye listy az sibhara begirad va sibhaye sabz ra berize to ye liste dge
    public static List<Apple> findGreenApple(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : apples) {
            if (a.getColor().equals(ColorConstant.GREEN)) ;
            result.add(a);
        }
        return result;
    }

    public static List<Apple> findApple(List<Apple> apples, String color, Integer weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : apples) {
            if (a.getColor().equals(color) && a.getWight().equals(weight)) {
                result.add(a);
            }
        }
        return result;

    }
}
