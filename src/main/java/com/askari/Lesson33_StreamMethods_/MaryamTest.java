package com.askari.Lesson33_StreamMethods_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 3/13/2021
 * Time: 6:58 PM
 * Project: IntelliJ IDEA
 */
public class MaryamTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(5);
        list.add(1);

        testStream(list);


    }

    public static void testStream(List<Integer> list){
        Integer sum = 0;
        for (Integer i : list){
            if (i>10){
                sum+=i;
            }
        }
        System.out.println(sum);

        // -----------------------------------------------
        Integer a = list.stream().filter((i)->i>10).mapToInt(i->i).sum();
        System.out.println(a);
    }
}
