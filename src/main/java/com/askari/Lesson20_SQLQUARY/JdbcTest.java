package com.askari.Lesson20_SQLQUARY;

import java.sql.*;

/**
 * Created by Maryam Askari
 * Date: 1/7/2021
 * Time: 2:51 PM
 * Project: IntelliJ IDEA
 */
public class JdbcTest {

    public static void main(String[] args) {

        try {
            // Baraye seda zadane Oracle Driver:
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Baraye sakhtane connection:
            /* Bayad 1.noe DB : Oracle
            2.Esme Connectin:thin
            3.Port ya dare vorod be DB : @localhost:1521
            4.Name makhzan : ex
            5.username : dar inja : maryam
            6.Password : dar inja : myjava123
            */
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam","myjava123");

            // Sakhte Statement ya jasoos roye connectiony ke sakhtim:
            Statement statement = connection.createStatement();

            // Baraye Insert kardan:---> khorojie executeUpdate int ast va neshan midahad chaandta user add karde ast!!!
            // khodesh auto commit ra anjam midahad. va digar niaz be neveshtane commit nadarim.
            statement.executeUpdate("insert into student(id,name,family) values (3,'Marzieh','Abbasi')");
            /*int i = statement.executeUpdate("insert into student(id,name,family) values (3,'Marzieh','Abbasi')");
            System.out.println(i);*/

            // Baraye vared kardane Query select nyaz be ResultSet darim:
            ResultSet resultSet = statement.executeQuery("select * from student");

            //Baraye khandane faghat nam heye jadvale Student:
            while (resultSet.next()){
                System.out.println(resultSet.getString("NAME"));
                System.out.println(resultSet.getString("FAMILY"));
                System.out.println(resultSet.getLong("ID"));
            }

            // Dar enteha bayad ham Statement va ham connection ra bebandim:
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
