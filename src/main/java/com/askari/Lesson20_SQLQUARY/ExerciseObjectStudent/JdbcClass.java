package com.askari.Lesson20_SQLQUARY.ExerciseObjectStudent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 1/9/2021
 * Time: 1:18 PM
 * Project: IntelliJ IDEA
 */
public class JdbcClass {
    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam", "myjava123");
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from student");

            List <Studen> studentList = new ArrayList<Studen>();
            while (resultSet.next()){
                Studen studen = new Studen();
                studen.setId(resultSet.getLong("ID"));
                studen.setName(resultSet.getString("NAME"));
                studen.setFamily(resultSet.getString("FAMILY"));
                studentList.add(studen);
            }

            statement.close();
            connection.close();

            for (Studen s : studentList){
                System.out.println("Student Id : " + s.getId());
                System.out.println("Student Name : " + s.getName());
                System.out.println("Student Family : " + s.getFamily());
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
