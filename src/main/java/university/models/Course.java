package university.models;

public class Course {
    private String courseId;
    private String courseName;
    private String courseCoordinator;


    public Course(String courseId, String courseName, String courseCoordinator) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCoordinator = courseCoordinator;
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
