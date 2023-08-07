package university.models.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import university.models.Course;

public abstract class Person {
    @Id @GeneratedValue
    private String id;
    private final String name;
    private String role;

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    protected abstract void registerCourse(Course course);
    protected abstract void removeCourse(Course course);
}
