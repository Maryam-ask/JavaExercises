package com.askari.JavaExercises.Exercise3a;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 12/12/2020
 * Time: 1:13 PM
 * Project: IntelliJ IDEA
 */
public class School {

    public static void main(String[] args) {
        // Courses:
        Course c1 = new Course("Programming");
        Course c2 = new Course("English");
        // Teachers:
        Teacher t1 = new Teacher("Marzieh",123456789);
        // Students:
        Student s1 = new Student("Maryam",213145678);
        Student s2 = new Student("Andreas",231457764);
        Student s3 = new Student("Ida",667459172);
        Student s4 = new Student("Martin",987654321);

        // Data for Programming course:
        List<Student> c1Students = new ArrayList<Student>();
        c1Students.add(s1);
        c1Students.add(s2);
        c1Students.add(s4);
        c1.setStudents(c1Students);
        c1.setTeacher(t1);
        System.out.println("Course "+c1.getCourseName()+", list of students:");
        for (Student a :c1.getStudents()){
            System.out.println(a.getName());
        }
        System.out.println("Teacher is "+ c1.getTeacher().getName());
        System.out.println("**********************");
        // Data for English course
        List<Student> c2Students = new ArrayList<Student>();
        c2Students.add(s1);
        c2Students.add(s2);
        c2Students.add(s3);
        c2Students.add(s4);
        c2.setStudents(c1Students);
        c2.setTeacher(t1);
        System.out.println("Course "+c2.getCourseName()+", list of students:");
        for (Student a :c2.getStudents()){
            System.out.println(a.getName());
        }
        System.out.println("Teacher is "+ c2.getTeacher().getName());
        System.out.println("**********************");
        // The teacher info:
        System.out.println("Teacher name is "+t1.getName());
        List<Course> t1Courses=new ArrayList<Course>();
        t1Courses.add(c1);
        t1Courses.add(c2);
        t1.setCourses(t1Courses);
        System.out.println("List of courses for "+t1.getName()+" is:");
        for (Course co:t1.getCourses()){
            System.out.println(co.getCourseName());
        }

    }
}
