package university.models;

import jakarta.persistence.*;
import university.models.interfaces.InformationPrinter;

import javax.swing.text.html.HTML;
import java.util.ArrayList;

@Entity
@Table(name = "concentration")
public class CourseConcentration implements InformationPrinter {
    private @Id
    @GeneratedValue Long id;
    String name;
    String description;
    @OneToMany
    ArrayList<Course> requiredCourses;

    public CourseConcentration() {}
    public CourseConcentration(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addRequiredCourse(Course course) {
        requiredCourses.add(course);
    }
    public void removeRequireCourse(Course course) {
        requiredCourses.remove(course);
    }
    @Override
    public String getInformation(){
        return this.description;
    }
    @Override
    public HTML format(){
        return null;
    }
}
