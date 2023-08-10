package university.models;

import jakarta.persistence.*;
import university.models.abstracts.Person;

import java.util.Collection;

@Entity
@Table(name = "student")
public class PersonStudent extends Person {
    private @Id
    @GeneratedValue
    @Column(name = "student_id")
    Long student_id;

//    private Course course;

    /** Creates a new instance of PersonStudent */
    public PersonStudent() {}

    public PersonStudent(String name) {
        super(name, "Student");
    }

//    @ManyToOne
//    public Course getCourse() {
//        return course;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }

    @Override
    public void registerCourse(Course course) {

    }

    @Override
    public void removeCourse(Course course) {

    }
}
