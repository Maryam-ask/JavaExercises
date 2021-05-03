package com.askari.Lesson36_Annotation.Deprecated;

import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 2:51 PM
 * Project: IntelliJ IDEA
 */
public class TestDeprecatedAnnotation {

    public static void main(String[] args) {
        UsingDeprecatedAnnotation u = new UsingDeprecatedAnnotation();
        u.a();
        u.testDeprecate(); // ---> Be ma hoshdar midahad ke to versione badi in method digar vojod nadarad.
    }
}
