package com.askari.lesson24;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Maryam Askari
 * Date: 1/18/2021
 * Time: 11:18 PM
 * Project: IntelliJ IDEA
 */
public class TestMain {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String [] s = {str1,str2,str3};

         */

        // Maryam m = new Maryam();

        DBMethods db = new DBMethods();

        while (true) {

            try {
                Class c = Class.forName("com.askari.lesson24.Maryam");
                Object object = c.newInstance();

                for (String a : db.metodsName()) {

                    Method method = object.getClass().getDeclaredMethod(a);

                    method.invoke(object); // invok az kodom Object?

                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


           /* Maryam maryam = new Maryam();
            maryam.a();
            maryam.b();
            maryam.c();*/

        }
    }
}
