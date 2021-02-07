package com.askari.Lesson22_MVC.controller;

import com.askari.Lesson22_MVC.model.bl.StudentManager;
import com.askari.Lesson22_MVC.model.bl.StudentManagerImpl;
import com.askari.Lesson22_MVC.model.to.Student;

import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 3:25 PM
 * Project: IntelliJ IDEA
 */
public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();
        Student student= new Student(2,"Ali","Dadmehr","0016178132",20);
        studentManager.registerStudent(student);

        studentManager.deleteStudent(1L);

        Student student1= new Student(2,"Ali","Mohammadi","0016178132",20);
        studentManager.updateStudent(student1);

        List<Student> studentList=studentManager.gatAll();
        for (Student s : studentList){
            System.out.println("s.getId() : " + s.getId());
            System.out.println("s.getName() + S.getFamily : "+ s.getName()+" "+s.getFamily());
        }

    }
}
