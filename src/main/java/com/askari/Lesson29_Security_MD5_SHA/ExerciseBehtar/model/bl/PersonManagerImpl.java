package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.bl;

import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.da.PersonDAO;
import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.da.PersonDAOImpl;
import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.to.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 3:28 PM
 * Project: IntelliJ IDEA
 */
public class PersonManagerImpl implements PersonManager{
    @Override
    public List<Person> getAllPersons() {
        PersonDAO personDAO = new PersonDAOImpl();
        return personDAO.selectPerson();

    }

    @Override
    public void uppdatePassword(Person person, String pass) {
        PersonDAO personDAO = new PersonDAOImpl();
        personDAO.updatePassword(person,pass);
    }
}
