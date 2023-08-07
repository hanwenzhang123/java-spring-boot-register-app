package university.models.abstracts;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import university.models.Course;
import university.models.interfaces.Department;
import university.models.types.ProgramDataType;

import java.util.ArrayList;

public abstract class Program implements Department {
    final ProgramDataType programType;
    int requiredYears = 0;
    ArrayList<Course> requiredCourses;

    public Program(ProgramDataType programType) {
        this.programType = programType;
    }

    public Program(ProgramDataType programType, int requiredYears) {
        this.programType = programType;
        this.requiredYears = requiredYears;
    }

    public int getRequiredYears() {
        return requiredYears;
    }

    public ProgramDataType getProgramType() {
        return programType;
    }

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }

    public abstract void addRequiredCourses(Course course);
}
