package university.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import university.models.abstracts.Person;

import java.util.ArrayList;

@Table(name = "student")
public class Student extends Person {
    private @Id
    @GeneratedValue Long id;
    ArrayList<Course> registeredCourses;
    public Student(String name) {
        super(name, "Student");
    }

    @Override
    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        registeredCourses.remove(course);
    }
}
