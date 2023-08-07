package university.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import university.models.abstracts.Program;

import static university.models.types.ProgramDataType.certificate;
@Entity
public class ProgramCertificate extends Program {
    private @Id
    @GeneratedValue Long id;
    final String degree = "Certificate Program";
    String nameOfProgram = null;
    boolean completion = false;

    protected ProgramCertificate() {
        super(certificate);
    }

    public ProgramCertificate(String nameOfProgram) {
        super(certificate);
        this.nameOfProgram = nameOfProgram;
    }

    public String getDegree() {
        return degree;
    }

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public boolean isCompletion() {
        return completion;
    }

    @Override
    public void addRequiredCourses(Course course) {
        int currentCourse = getRequiredCourses().size();
        if(currentCourse < 4) {
            getRequiredCourses().add(course);
        } else if (currentCourse == 4) {
            this.completion = true;
        }
    }

    @Override
    public String printInformation(){
        return  this.degree + " in " + this.nameOfProgram;
    }

    public Long getId() {
        return id;
    }
}