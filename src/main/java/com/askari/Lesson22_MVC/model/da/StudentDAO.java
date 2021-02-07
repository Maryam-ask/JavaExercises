package com.askari.Lesson22_MVC.model.da;

import com.askari.Lesson22_MVC.model.to.Student;

import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 2:35 PM
 * Project: IntelliJ IDEA
 */
public interface StudentDAO {
    List<Student> select();
    void insert(Student student);
    void delete(Long id); // Mitavanad Boolean bashad.
    void update(Student student);
}
