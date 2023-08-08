package university.models;

import jakarta.persistence.*;
import university.models.abstracts.Person;

import java.util.ArrayList;

@Entity
@Table(name = "student")
public class PersonStudent extends Person {
    private @Id
    @GeneratedValue Long id;

    long gpa;

    String thesisTopic;
    @OneToOne
    PersonFaculty thesisAdvisor;

    @OneToMany
    ArrayList<Course> enrolledCourses;

    public PersonStudent() {}
    public PersonStudent(String name) {
        super(name, "Student");
    }

    @Override
    public void registerCourse(Course course) {
        enrolledCourses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        enrolledCourses.remove(course);
    }
}
