package university.services;

import university.models.abstracts.Program;

import java.util.List;
public interface IRoster {
    void createUndergraduateProgram(String name);
    void createGraduateProgram(String name);
    void createCertificateProgram(String name);
    List<Program> getAllUndergraduatePrograms();
    List<Program> getAllGraduatePrograms();
    List<Program> getAllCertificatePrograms();
    void deleteAllPrograms();
}
