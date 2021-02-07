package com.askari.Lesson20_SQLQUARY.Exercise;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 1/8/2021
 * Time: 11:33 AM
 * Project: IntelliJ IDEA
 */
public class JdbcScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Driver fo Jdbc
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connection
            Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam","myjava123");
            // Statement
            Statement statement= connection.createStatement();

            System.out.println("Enter an ID:");
            int idInput = input.nextInt();
            System.out.println("Enter a name: ");
            String nameInput = input.next();
            System.out.println("Enter a family: ");
            String familyInput = input.next();

            statement.executeUpdate("insert into student(id,name,family) values ("+idInput+
                    ",'"+nameInput+"',"+"'"+familyInput+"')");

            // Select
            ResultSet resultSet= statement.executeQuery("select * from student");

            while (resultSet.next()){
                System.out.print("Id : "+resultSet.getLong("ID")+
                        " Name : "+resultSet.getString("NAME")+
                        " Family : "+resultSet.getString("FAMILY")+"\n");
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
