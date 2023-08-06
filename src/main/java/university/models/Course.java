package university.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@NamedQuery(
        name="Course.findByCoordinator",
        query="SELECT c FROM Course c WHERE c.courseCoordinator = :name"
)
@Table(name = "course")
public class Course {
    private @Id
    @GeneratedValue Long id;
    private String courseId;
    private String courseName;
    private String courseCoordinator;

    protected Course() {

    }

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

    public String toString() {
        return courseCoordinator;
    }
}
