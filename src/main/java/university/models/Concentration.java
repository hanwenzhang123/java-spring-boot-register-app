package university.models;

import university.models.interfaces.InformationPrinter;

import javax.swing.text.html.HTML;
import java.util.ArrayList;

public class Concentration implements InformationPrinter {
    String name;
    String description;
    ArrayList<Course> requiredCourses;

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
