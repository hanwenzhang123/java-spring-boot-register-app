package university.services;

import university.models.abstracts.Person;
import university.models.abstracts.Program;
import university.models.types.FacultyStatusDataTypes;

import java.util.List;
public interface IRoster {
    void createUndergraduateProgram(String name);
    void createGraduateProgram(String name);
    void createCertificateProgram(String name);
    List<Program> getAllUndergraduatePrograms();
    List<Program> getAllGraduatePrograms();
    List<Program> getAllCertificatePrograms();
    void deleteAllPrograms();

    void createCourseConcentration(String name, String description);

    void createStudent(String name);
    void createFaculty(String name, FacultyStatusDataTypes facultyStatus);
    List<Person> getAllStudents();
    List<Person> getAllFaculties();
    void deleteAllPeople();
}
