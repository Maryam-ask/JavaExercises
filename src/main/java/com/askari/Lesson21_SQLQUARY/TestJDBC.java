package com.askari.Lesson21_SQLQUARY;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 1/15/2021
 * Time: 1:13 PM
 * Project: IntelliJ IDEA
 */
public class TestJDBC {
    public static void main(String[] args) {

        try {
            // Baraye tarif kardane drivere Oracle:
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Sakhtane Connection:
            Connection connection= DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe",
                    "maryam","myjava123");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int idInput = scanner.nextInt();

            // Sakhtane Statement:
            //Statement statement= connection.createStatement();
            /*
            Baraye anke halate 1=1 iejad nashavad va dastresie amntari be SQL dashte bashim bayad Statement ra avaz konim:
            Dar halaty ke PreparedStatement tarif mikonim Query ra dakhele an tarif mikonim va dar akhar faghat an ra execute mikonam.
             */
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id=? or name=?");
            // Bahse Transaction: chandta kar ra hamzaman anjam dahim.
            connection.setAutoCommit(false); // vaghti in uppdate ra anjam dadi commit nakon.
            preparedStatement.setInt(1, idInput); // avalin alamate soal ra name mizarad.
            preparedStatement.setString(2,name); // dovomin alamate soal ra name mizarad.
            // Baraye Insert kardan:
            //int i = statement.executeUpdate("insert into student (id,name,family) values (6,'Nasser','khanzadeh')");
            // Baraye Delete kardan---> ke khorojie an ye integer ast ke tedade delete shodehara neshan midahad.
            //int j = statement.executeUpdate("delete from student where id=2");
            //int j = statement.executeUpdate("delete from student where id>2"); // Harchi ID bozorgtar az 2 hast ra pak mikonad.

            /*System.out.println(i);
            System.out.println(j);*/


            //ResultSet resultSet = statement.executeQuery("select * from student where name='"+name+"'");

            // baraye khandan:
            //ResultSet resultSet = statement.executeQuery("select * from student");
            //ResultSet resultSet = statement.executeQuery("select * from student where name='Marzieh'");
            //ResultSet resultSet = statement.executeQuery("select * from student where name='Marzieh' or 1=1");
            /*
            Dar halate bala SQL INJECTION  rokh dade ast yani barname ra hack kardeiem.
            vaghti mizarim 1=1 ---> hameye etelate jadval ra miarad.
             */

            ResultSet resultSet = preparedStatement.executeQuery();

           /* if (resultSet.wasNull()){
                System.out.println("SSSSSSSSSSss");
            }*/

            while(resultSet.next()){
                System.out.println(resultSet.getLong("ID"));
                System.out.println(resultSet.getString("NAME"));
                System.out.println(resultSet.getString("FAMILY"));
            }
            connection.commit();// commit daste khodemon bashe.
            //statement.close();
            preparedStatement.close();
            connection.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
