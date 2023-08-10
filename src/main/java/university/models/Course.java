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
    @GeneratedValue Long id;
    private String courseId;
    private String courseName;
    private String courseCoordinator;
    private String description;
    private String syllabus;

//    @OneToOne
//    PersonFaculty faculty;

    @Transient
    Collection<PersonStudent> students;

    /** Creates a new instance of Course */
    protected Course() {}

    public Course(String courseId, String courseName, String courseCoordinator) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCoordinator = courseCoordinator;
    }

    public Long getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
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

    @ManyToMany(cascade = CascadeType.REMOVE, mappedBy = "enrolledCourses")
    public Collection<PersonStudent> getStudents() {
        return students;
    }

    @Override
    public String getInformation() {
        return "Description: " + this.description + "\nSyllabus: " + this.syllabus;
    }

    @Override
    public HTML format() {
        return null;
    }
}
