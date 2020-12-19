package JavaExercises.Exercise3a;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 12/12/2020
 * Time: 1:04 PM
 * Project: IntelliJ IDEA
 */
public class Course {

    private Teacher teacher= new Teacher();
    private List<Student> students= new ArrayList<Student>();
    private String courseName;

    public Course(String courseName){
        this.courseName=courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;

    }

    public void setStudents(List<Student> students) {
        for (Student a : students){
            this.students.add(a);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
