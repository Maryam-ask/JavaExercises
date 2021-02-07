package com.askari.Lesson5_INHERITANCE;

/**
 * Created by Maryam Askari
 * Date: 11/17/2020
 * Time: 11:45 AM
 * Project: IntelliJ IDEA
 */
public class Main {
    public static void main(String[] args) {

        Amirsam amirsam = new Amirsam(); // constructor: Amirsam
        amirsam.a(); // Metode: Amirsam
        amirsam.b();
        System.out.println("*********************");

        // metodhaye pedar ra ham be ers mibarad.
        Soheil soheil= new Soheil(); // Constructor: Amirsam - Soheil
        soheil.a(); // Metode a soheil
        soheil.b();
        soheil.s();
        System.out.println("*********************");

        Keyvan keyvan= new Keyvan(); // Constructor : Amirsam - Soheil - Keyvan
        keyvan.a(); // Metode a Keyvan
        keyvan.b();
        keyvan.s();
        keyvan.k();
        System.out.println("*********************");

        Amirsam amirsamS = new Soheil(); // Constructor: Amirsam - Soheil
        amirsamS.a();
        amirsamS.b();
        System.out.println("*********************");

        Amirsam amirsamK = new Keyvan(); // har 3 constructor
        amirsamK.a();
        amirsamK.b();
        System.out.println("*********************");

        Soheil soheilK = new Keyvan(); // har 3 constructor
        soheilK.a();
        soheilK.b();
        soheilK.s();

    }
}
