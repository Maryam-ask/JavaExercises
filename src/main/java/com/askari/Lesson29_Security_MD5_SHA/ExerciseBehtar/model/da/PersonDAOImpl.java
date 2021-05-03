package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.da;

import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.model.to.Person;
import com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.security.SecurityUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 2:46 PM
 * Project: IntelliJ IDEA
 */
public class PersonDAOImpl implements PersonDAO {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonDAOImpl() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam", "myjava123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> selectPerson() {
        List<Person> listOfPerson = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from person");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getLong("ID"));
                person.setAge(resultSet.getInt("AGE"));
                person.setName(resultSet.getString("NAME"));
                person.setFamily(resultSet.getString("FAMILY"));

                listOfPerson.add(person);
            }

            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listOfPerson;
    }

    @Override
    public void updatePassword(Person person, String pass) {

        try {
            preparedStatement = connection.prepareStatement("update person set password=? where name=?");
            preparedStatement.setString(1, SecurityUtils.shaHashing(pass));
            preparedStatement.setString(2, person.getName());
            preparedStatement.executeUpdate();

            close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close() throws SQLException { // Behtare Exception be layeye business berese!!!!!!
        preparedStatement.close();
        connection.close();
    }
}
