package com.askari.Lesson26;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Maryam Askari
 * Date: 2/2/2021
 * Time: 7:30 PM
 * Project: IntelliJ IDEA
 */
public class MainRef {

    public static void main(String[] args) {


     /*
        try {

            String str = "a";
            Class aClass = Class.forName("com.askari.Lesson26.Marzieh");
            Object aObject = aClass.newInstance();
            Method method=aObject.getClass().getDeclaredMethod(str);
            method.invoke(aObject);

      */
        String str = "a";
        while (true) {
            try {
                Thread.sleep(100);
                Class a1Class = Class.forName("com.askari.Lesson26.Mohammad");
                Object a1Object = a1Class.newInstance();
                Method method1 = a1Object.getClass().getDeclaredMethod(str);
                method1.invoke(a1Object);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

       /* } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */

    }
}
