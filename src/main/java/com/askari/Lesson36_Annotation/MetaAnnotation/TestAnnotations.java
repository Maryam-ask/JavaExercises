package com.askari.Lesson36_Annotation.MetaAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 3:17 PM
 * Project: IntelliJ IDEA
 */

@CustomAnnotation
public class TestAnnotations {

    @CustomAnnotation
    public void test() {
        System.out.println("dddddddddddd");
    }

    public static void main(String[] args) {
        TestAnnotations ta = new TestAnnotations();
        Annotation[] annotations = ta.getClass().getDeclaredAnnotations();
        System.out.println(annotations.length);

        Method[] methods = ta.getClass().getDeclaredMethods();
        Annotation[] annotations2 = methods[1].getDeclaredAnnotations();
        System.out.println(annotations2.length);
    }
}
