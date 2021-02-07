package com.askari.Lesson22_MVC.model.da;

import com.askari.Lesson22_MVC.model.to.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 2:05 PM
 * Project: IntelliJ IDEA
 */
public class StudentDAOImpl implements StudentDAO {

    private Connection connection;
    private PreparedStatement preparedStatement;

    /* Baraye inke betavanim dar methodhaye digar be DB dastresi dashte bashim
       va nakhahim dobare yek connection bezanim
       va baraye jologiri az neveshtane kod haye tekrari.
    */
    public StudentDAOImpl(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam","myjava123");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Methodi ke etelat ra az DB khande va listy az daneshjoha be ma midahad.
     * @return List of students
     */
    @Override
    public List<Student> select(){
        List<Student> stuResult = new ArrayList<Student>();

        try {

            preparedStatement = connection.prepareStatement("select * from student");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getLong("ID"));
                student.setName(resultSet.getString("NAME"));
                student.setFamily(resultSet.getString("FAMILY"));
                student.setNationalCode(resultSet.getString("NATIONALCODE"));
                stuResult.add(student);
            }
            close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stuResult;
    }

    private void close() throws SQLException {
        preparedStatement.close();
        connection.close();
    }

    @Override
    public void insert(Student student){
        try {
            preparedStatement = connection.prepareStatement("insert into student(id,name,family,nationalcode,age) values (?,?,?,?,?)");

        preparedStatement.setLong(1,student.getId());
        preparedStatement.setString(2,student.getName());
        preparedStatement.setString(3,student.getFamily());
        preparedStatement.setString(4,student.getNationalCode());
        preparedStatement.setInt(5,student.getAge());

        preparedStatement.executeUpdate();

        close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long id) {
        try {
            preparedStatement=connection.prepareStatement("delete student where id=?");
            preparedStatement.setLong(1,id);

            preparedStatement.executeUpdate();

            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Student student) {
        try {
            preparedStatement = connection.prepareStatement("update student set NAME=?,family=?,nationalcode=?,age=? where id=?");

            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getFamily());
            preparedStatement.setString(3,student.getNationalCode());
            preparedStatement.setInt(4,student.getAge());
            preparedStatement.setLong(5,student.getId());

            preparedStatement.executeUpdate();
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
