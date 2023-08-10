package university.models.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import university.models.Course;

public abstract class Person {
    @Id @GeneratedValue
    private String id;
    private String name;
    private String role;

    public Person(){}

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

    public abstract void registerCourse(Course course);
    public abstract void removeCourse(Course course);
}
