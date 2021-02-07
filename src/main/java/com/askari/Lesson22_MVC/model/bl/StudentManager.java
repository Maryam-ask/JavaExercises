package com.askari.Lesson22_MVC.model.bl;

import com.askari.Lesson22_MVC.model.to.Student;

import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 3:15 PM
 * Project: IntelliJ IDEA
 */
public interface StudentManager {
    void registerStudent(Student student);
    List<Student> gatAll();
    void deleteStudent(Long id);
    void updateStudent(Student student);

}
