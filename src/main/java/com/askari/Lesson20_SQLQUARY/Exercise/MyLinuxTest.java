package com.askari.Lesson20_SQLQUARY.Exercise;

import com.askari.JavaExercises.andras.Myclass;

import java.sql.*;

/**
 * Created by Maryam Askari
 * Date: 5/30/2021
 * Time: 7:50 PM
 * Project: IntelliJ IDEA
 */
public class MyLinuxTest {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public void closeAll() throws SQLException {
        preparedStatement.close();
        connection.close();
    }

    public Connection getConnection(){

        String databaseUser = "mary";
        String databasePassword="mylinux123";
        String url ="jdbc:mysql://localhost:3306/yourDB";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,databaseUser,databasePassword);

        }catch (Exception e){
            e.getStackTrace();
            e.getCause();
        }
        return connection;
    }

    public void select(){
        try{
            Statement stmt=getConnection().createStatement();
            ResultSet rs=stmt.executeQuery("select * from person");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));


            closeAll();
        }catch (Exception e){
            e.getStackTrace();
            e.getCause();
        }
    }

    public void insert(){
        try{
            Statement stmt=getConnection().createStatement();
            int rs = stmt.executeUpdate("insert into person (firstname,lastname,email,age)values ('Mary','Askari','m@gmail.com',27)");
            System.out.println(rs);
        }catch (Exception e){
            e.getStackTrace();
            e.getCause();
        }
    }

    public static void main(String[] args) {
        MyLinuxTest myLinuxTest = new MyLinuxTest();
        myLinuxTest.insert();
        myLinuxTest.select();
    }
}
