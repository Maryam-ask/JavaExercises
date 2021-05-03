package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.bl;

import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.to.Person;

import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 3:27 PM
 * Project: IntelliJ IDEA
 */
public interface PersonManager {

    List<Person> getAllPersons();
    void uppdatePassword(Person person,String pass);
}
