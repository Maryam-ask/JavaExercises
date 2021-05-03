package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.controller;

import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.bl.PersonManager;
import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.bl.PersonManagerImpl;
import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.to.Person;

import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 2:39 PM
 * Project: IntelliJ IDEA
 */
public class main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManagerImpl();
        Scanner scr = new Scanner(System.in);
        for (Person person : personManager.getAllPersons()) {
            System.out.println("please enter the paswword for : " + person.getName());
            String pass = scr.nextLine();
            personManager.uppdatePassword(person, pass);
        }
    }
}
