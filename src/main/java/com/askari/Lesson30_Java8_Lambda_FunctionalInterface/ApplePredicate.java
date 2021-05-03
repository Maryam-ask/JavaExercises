package com.askari.Lesson30_Java8_Lambda_FunctionalInterface;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 4:14 PM
 * Project: IntelliJ IDEA
 */

@FunctionalInterface // Zamanike in Anotation ra estefade mikonim faghat ye method mitavanim darone Interface dashte bashim
public interface ApplePredicate {
    boolean find(Apple apple);

    /* Methode defult khodesh badane darad va niaz be piadesazi nadarad
    !!!IN AZ VIJEGI HAYE JAVA 8 HAST KE INTERFACE AN BADANE DARAD.
     */
    default boolean find(){
        System.out.println("FFFFFFF");
        return true;
    }

}
