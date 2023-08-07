package university.models;

import jakarta.persistence.Table;
import university.models.types.FacultyStatus;

@Table(name = "faculty")
public class Faculty extends Person {
    FacultyStatus facultyStatus;
    public Faculty(String name, FacultyStatus facultyStatus) {
        super(name, "Faculty");
        this.facultyStatus = facultyStatus;
    }

    @Override
    void register() {

    }
}