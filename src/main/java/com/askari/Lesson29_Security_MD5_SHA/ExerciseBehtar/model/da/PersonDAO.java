package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.da;

import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.to.Person;

import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 3:21 PM
 * Project: IntelliJ IDEA
 */
public interface PersonDAO {
    List<Person> selectPerson();
    void updatePassword(Person person,String pass);
}
