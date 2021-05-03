package com.askari.Lesson36_Annotation.Suppress;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 2:39 PM
 * Project: IntelliJ IDEA
 */
public class TestAnnotation {

    @SuppressWarnings("unchecked")  // ---> khatahaye compiler ra migirad
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        for (Object obj: list){
            System.out.println(obj);
        }
    }
}
