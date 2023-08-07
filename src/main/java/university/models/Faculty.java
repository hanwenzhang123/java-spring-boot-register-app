package university.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import university.models.abstracts.Person;
import university.models.types.FacultyStatusDataTypes;

import java.util.ArrayList;

@Table(name = "faculty")
public class Faculty extends Person {
    FacultyStatusDataTypes facultyStatus;
    ArrayList<Course> teachingCourses;
    String additionalRoles;
    public Faculty(String name, FacultyStatusDataTypes facultyStatus) {
        super(name, "Faculty");
        this.facultyStatus = facultyStatus;
    }

    public void setAdditionalRoles(String additionalRoles) {
        this.additionalRoles = additionalRoles;
    }

    @Override
    public void registerCourse(Course course) {
        teachingCourses.add(course);
    }
    @Override
    public void removeCourse(Course course) {
        teachingCourses.remove(course);
    }
}