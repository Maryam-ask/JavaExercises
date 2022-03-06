package com.askari.Lesson21_SQLQUARY.AutoIncrementKeyValuesInMYSQL;

import java.sql.*;

/**
 * Created by Maryam Askari
 * Date: 5/28/2021
 * Time: 1:17 PM
 * Project: IntelliJ IDEA
 */
public class TeacherDAOImpl {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public void closeAll() throws SQLException {
        preparedStatement.close();
        connection.close();
    }

    public Connection getConnection(){

        String databaseUser = "maryam";
        String databasePassword="myjava123";
        String url ="jdbc:oracle:thin:@localhost:1521:xe";

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url,databaseUser,databasePassword);

        }catch (Exception e){
            e.getStackTrace();
            e.getCause();
        }
        return connection;
    }

    public Teacher selectTeacher(String name){
        Teacher teacher = new Teacher();
        try {
            preparedStatement = getConnection().prepareStatement("select * from teacher where name='"+name+"'");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                teacher.setId(resultSet.getLong("id"));
                teacher.setFamily(resultSet.getString("family"));
                teacher.setAddress(resultSet.getString("address"));
                teacher.setPhone(resultSet.getString("mobilephone"));
                teacher.setAge(resultSet.getInt("age"));

            }
            closeAll();
        }catch (Exception e){
            e.getStackTrace();
            e.getCause();
        }
        return teacher;
    }

    public void insert(Teacher teacher){


        try{
            preparedStatement = getConnection().prepareStatement("insert into teacher (id,name,family,subject," +
                            "mobilephone, address,age) values (id_sequence.nextval,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,teacher.getName());
            preparedStatement.setString(2,teacher.getFamily());
            preparedStatement.setString(3,teacher.getSubject());
            preparedStatement.setString(4,teacher.getPhone());
            preparedStatement.setString(5,teacher.getAddress());
            preparedStatement.setInt(6,teacher.getAge());

            preparedStatement.executeUpdate();

            ResultSet keyResultSet = preparedStatement.getGeneratedKeys();
            if(keyResultSet.next()) {
                int id = keyResultSet.getInt(1);
                teacher.setId(id);
            }
            System.out.println("teacherId: "+teacher.getId());

        }catch (Exception e){
            e.getStackTrace();
            e.getCause();
        }
    }

    public static void main(String[] args) {
        Teacher teacher2 = new Teacher("Shahla","Askari","Mathematic",
               "0793359552","Stockholm, sweden",27);

        TeacherDAOImpl teacherDAO = new TeacherDAOImpl();
        teacherDAO.insert(teacher2);
        Teacher newTeacher = teacherDAO.selectTeacher("Shahla");
        System.out.println(newTeacher.getId());
    }


}
