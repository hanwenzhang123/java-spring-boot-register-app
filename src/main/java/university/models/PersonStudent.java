package university.models;

import jakarta.persistence.*;
import university.models.abstracts.Person;

import java.util.Collection;

@Entity
@Table(name = "student")
public class PersonStudent extends Person {
    private @Id
    @GeneratedValue Long id;
    long gpa;
    String thesisTopic;
    @Transient
    Collection<Course> enrolledCourses;

    public PersonStudent() {}
    public PersonStudent(String name) {
        super(name, "Student");
    }

    @ManyToMany(cascade = CascadeType.REMOVE, mappedBy = "students")
    public Collection<Course> getEnrolledCourses() {
        return enrolledCourses;
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
