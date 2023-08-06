package university.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "student")
public class Student extends Person {
    public Student(String name) {
        super(name, "Student");
    }

    @Override
    void register() {

    }
}
