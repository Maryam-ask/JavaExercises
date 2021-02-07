package com.askari.lesson24;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Maryam Askari
 * Date: 1/17/2021
 * Time: 6:07 PM
 * Project: IntelliJ IDEA
 */
public class DBMethods {

    private Connection connection;
    private PreparedStatement preparedStatement;
    DBMethods() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<String> metodsName() {

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "maryam", "myjava123");
            preparedStatement = connection.prepareStatement("select * from work order by id ");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<String> mName = new ArrayList<>();
            while (resultSet.next()) {
                mName.add(resultSet.getString("NAME"));
            }

            preparedStatement.close();
            connection.close();

            return mName;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
