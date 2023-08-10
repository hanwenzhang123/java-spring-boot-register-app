package university.models;

import jakarta.persistence.*;
import university.models.abstracts.Person;
import university.models.types.FacultyStatusDataTypes;

import java.util.ArrayList;

@Entity
@Table(name = "faculty")
public class PersonFaculty extends Person {
    private @Id
    @GeneratedValue Long id;
    FacultyStatusDataTypes facultyStatus;
//    @OneToMany
//    ArrayList<Course> teachingCourses;
//    @OneToOne
//    PersonStudent advisingStudent;
    public PersonFaculty(String name, FacultyStatusDataTypes facultyStatus) {
        super(name, "Faculty");
        this.facultyStatus = facultyStatus;
    }

    public PersonFaculty() {
    }


    @Override
    public void registerCourse(Course course) {

        // teachingCourses.add(course);
    }
    @Override
    public void removeCourse(Course course) {

        // teachingCourses.remove(course);
    }
}