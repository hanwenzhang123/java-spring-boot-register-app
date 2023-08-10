package university.models;

import jakarta.persistence.*;
import university.models.interfaces.InformationPrinter;

import javax.swing.text.html.HTML;
import java.util.Collection;

@Entity
@NamedQuery(
        name="Course.findByCoordinator",
        query="SELECT c FROM Course c WHERE c.courseCoordinator = :name"
)
@Table(name = "course")
public class Course implements InformationPrinter {
    private @Id
    @GeneratedValue
    @Column(name = "course_id")
    Long course_id;
    private String courseNumber;
    private String courseName;
    private String courseCoordinator;
    private String description;
    private String syllabus;
//    private Collection<PersonStudent> students;

    /** Creates a new instance of Course */
    protected Course() {}

    public Course(String courseNumber, String courseName, String courseCoordinator) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.courseCoordinator = courseCoordinator;
    }

    public Long getId() {
        return course_id;
    }

    public String getCourseId() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCoordinator() {
        return courseCoordinator;
    }

    public String getDescription() {
        return description;
    }

    public String getSyllabus() {
        return syllabus;
    }

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Course")
//    public Collection<PersonStudent> getStudents() {
//        return students;
//    }
//
//    public void setStudents(Collection<PersonStudent> students) {
//        this.students = students;
//    }

    @Override
    public String getInformation() {
        return "Description: " + this.description + "\nSyllabus: " + this.syllabus;
    }

    @Override
    public HTML format() {
        return null;
    }
}
