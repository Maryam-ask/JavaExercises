package com.askari.Lesson29_Security_MD5_SHA.exercise;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 2/18/2021
 * Time: 3:20 PM
 * Project: IntelliJ IDEA
 */
public class TestMyDataBase {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam","myjava123");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from person");

            ResultSet resultSet = preparedStatement.executeQuery();

            Scanner scanner = new Scanner(System.in);
            HashClass md5Pass = new HashClass();

            while (resultSet.next()){

                System.out.println("Enter password for "+resultSet.getString("NAME"));

                String name =resultSet.getString("NAME");
                String inputPass = scanner.nextLine();

                String encodePass = md5Pass.md5Hashing(inputPass);


                 preparedStatement.executeUpdate("update person set password='"+
                        encodePass+"' where name ='"+name+"'");

            }


            preparedStatement.close();
            connection.close();



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
