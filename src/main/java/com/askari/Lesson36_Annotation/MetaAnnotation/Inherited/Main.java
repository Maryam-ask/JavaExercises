package com.askari.Lesson36_Annotation.MetaAnnotation.Inherited;

import java.lang.annotation.Annotation;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 3:31 PM
 * Project: IntelliJ IDEA
 */

public class Main {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        Annotation[] annotations = subClass.getClass().getAnnotations();
        for (int i=0 ; i<annotations.length ; i++){
            Annotation annotation = annotations[i];
            System.out.println("Annotation : " + annotation);
        }
    }
}
