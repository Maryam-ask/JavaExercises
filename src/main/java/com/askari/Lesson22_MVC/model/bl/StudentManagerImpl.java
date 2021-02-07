package com.askari.Lesson22_MVC.model.bl;

import com.askari.Lesson22_MVC.model.da.StudentDAO;
import com.askari.Lesson22_MVC.model.da.StudentDAOImpl;
import com.askari.Lesson22_MVC.model.to.Student;

import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 3:18 PM
 * Project: IntelliJ IDEA
 */
public class StudentManagerImpl implements StudentManager{
    

    
    @Override
    public void registerStudent(Student student) {
        System.out.println("***** registerStudent *****");
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.insert(student);
    }

    @Override
    public List<Student> gatAll() {
        System.out.println("**** getAll ****");
        StudentDAO studentDAO = new StudentDAOImpl();
        return  studentDAO.select();
    }

    @Override
    public void deleteStudent(Long id) {
        System.out.println("***** deleteStudent *****");
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.delete(id);
    }

    @Override
    public void updateStudent(Student student) {
        System.out.println("***** updateStudent *****");
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.update(student);
    }
}
