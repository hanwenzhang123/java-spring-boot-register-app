package university.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import university.models.abstracts.Program;
import university.models.types.ProgramDataType;

import java.util.ArrayList;

import static university.models.types.ProgramDataType.graduate;

@Entity
public class ProgramGraduate extends Program {
    private @Id
    @GeneratedValue Long id;
    final String degree = "Master of Science (M.S.)";
    String nameOfProgram = null;

    public ProgramGraduate(String nameOfProgram) {
        super(graduate, 2);
        this.nameOfProgram = nameOfProgram;
    }

    public Long getId() {
        return id;
    }

    public String getDegree() {
        return degree;
    }

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public ProgramGraduate() {
        super(graduate, 2);
    }

    @Override
    public void addRequiredCourses(Course course) {
        getRequiredCourses().add(course);
    }

    @Override
    public String printInformation(){
        return this.degree + " in " + this.nameOfProgram;
    }
}
