package university.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import university.models.abstracts.Program;

import static university.models.types.ProgramDataType.undergraduate;

@Entity
public class ProgramUndergraduate extends Program {
    private @Id
    @GeneratedValue Long id;
    final String degree = "Bachelor of Science (B.S.)";
    String nameOfProgram = null;

    public ProgramUndergraduate(String nameOfProgram) {
        super(undergraduate, 4);
        this.nameOfProgram = nameOfProgram;
    }

    public ProgramUndergraduate() {
        super(undergraduate, 4);
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

    @Override
    public void addRequiredCourses(Course course) {
        getRequiredCourses().add(course);
    }

    @Override
    public String printInformation(){
        return this.degree + " in " + this.nameOfProgram;
    }
}
