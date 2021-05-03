package com.askari.Lesson36_Annotation.SafeVarargs;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 3:00 PM
 * Project: IntelliJ IDEA
 */
public class TestSafeVarargsAnnotation {

    public static void main(String[] args) {
        test("Mary","Nadi","MArzy","Andry");
    }

    @SafeVarargs
    public static void test(String ... s){
        String[] dd = s;
    }
}
