package JavaExercises.Exercise3a;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 12/12/2020
 * Time: 1:03 PM
 * Project: IntelliJ IDEA
 */
public class Student extends Person{

    private List <Course> courses = new ArrayList<Course>();

    public Student(){super();}

    public Student(String name, int idNumber){
        super(name,idNumber);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
