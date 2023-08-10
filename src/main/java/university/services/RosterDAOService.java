package university.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import university.models.*;
import university.models.abstracts.Person;
import university.models.abstracts.Program;
import university.models.types.FacultyStatusDataTypes;

import java.util.List;

@Repository
@Transactional
public class RosterDAOService implements IRoster {
    @PersistenceContext
    private EntityManager entityManager;

    public RosterDAOService() {
        super();
    }

    @Override
    public void createUndergraduateProgram(String name) {
        Program program = new ProgramUndergraduate(name);
        entityManager.persist(program);
    }

    @Override
    public void createGraduateProgram(String name) {
        Program program = new ProgramGraduate(name);
        entityManager.persist(program);
    }

    @Override
    public void createCertificateProgram(String name) {
        Program program = new ProgramCertificate(name);
        entityManager.persist(program);
    }

    @Override
    public List<Program> getAllUndergraduatePrograms() {
        Query query = entityManager.createQuery("SELECT c FROM ProgramUndergraduate c");
        return query.getResultList();
    }

    @Override
    public List<Program> getAllGraduatePrograms() {
        Query query = entityManager.createQuery("SELECT c FROM ProgramGraduate c");
        return query.getResultList();
    }

    @Override
    public List<Program> getAllCertificatePrograms() {
        Query query = entityManager.createQuery("SELECT c FROM ProgramCertificate c");
        return query.getResultList();
    }

    @Override
    public void deleteAllPrograms() {
        Query query1 = entityManager.createQuery("DELETE FROM ProgramUndergraduate");
        Query query2 = entityManager.createQuery("DELETE FROM ProgramGraduate");
        Query query3 = entityManager.createQuery("DELETE FROM ProgramCertificate");
        query1.executeUpdate();
        query2.executeUpdate();
        query3.executeUpdate();
    }

    @Override
    public void createCourseConcentration(String name, String description) {
        CourseConcentration concentration= new CourseConcentration(name, description);
        entityManager.persist(concentration);
    }

    @Override
    public void createStudent(String name) {
        Person student = new PersonStudent(name);
        entityManager.persist(student);
    }

    @Override
    public void createFaculty(String name, FacultyStatusDataTypes facultyStatus) {
        Person faculty = new PersonFaculty(name, facultyStatus);
        entityManager.persist(faculty);
    }

    @Override
    public List<Person> getAllStudents() {
        Query query = entityManager.createQuery("SELECT c FROM PersonStudent c");

        return query.getResultList();
    }

    @Override
    public List<Person> getAllFaculties() {
        Query query = entityManager.createQuery("SELECT c FROM PersonFaculty c");
        return query.getResultList();
    }

    @Override
    public void deleteAllPeople() {
        Query query1 = entityManager.createQuery("DELETE FROM PersonStudent");
        Query query2 = entityManager.createQuery("DELETE FROM PersonFaculty");
        query1.executeUpdate();
        query2.executeUpdate();
    }
}
