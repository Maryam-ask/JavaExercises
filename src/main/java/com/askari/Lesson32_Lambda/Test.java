package com.askari.Lesson32_Lambda;

import java.util.Comparator;

/**
 * Created by Maryam Askari
 * Date: 3/4/2021
 * Time: 7:02 PM
 * Project: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {

        test1((x,y)->x+y);
        // test1(Integer::sum); mrthode sam dar Classe Integer vojod darad baraye seda zadan faghat ::
        TestLambda testLambda = (x,y)->x+y;
    // *******************************************************************

        test2((s)->System.out.println(s));
        // Method reference --> ( Class::Method )
        // test2(System.out::println);

    // *******************************************************************

        test3(apple -> System.out.println(apple.getColor()) );

    // *******************************************************************

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
              /*  if (o1 > o2){
                    return 1;
                }else {
                    return 0;
                }*/
                 return o1.compareTo(o2);
            }
        };

       Comparator<Integer> comparator1 = (Integer x,Integer y)->{return x.compareTo(y);};
    }

    public static void test1(TestLambda testLambda){
        System.out.println(testLambda.sum(2,3));
    }

    public static void test2(TestLambda2 testLambda2){
        testLambda2.print("Salam Donya");
    }

    public static void test3 (TestLambdaApple testLambdaApple){
        testLambdaApple.printColorApple(new Apple(AppleColorConstant.RED,12));
    }



}
