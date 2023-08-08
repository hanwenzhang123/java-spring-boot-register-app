package university.seeds;

import university.services.RosterDAOService;

import static university.models.types.FacultyStatusDataTypes.partTime;
import static university.models.types.FacultyStatusDataTypes.fullTime;

public class SeedPersonData {
    public SeedPersonData(RosterDAOService personService) {
        personService.deleteAllPeople();
        personService.createFaculty("Pinsky", fullTime);
        personService.createFaculty("Raghu", fullTime);
        personService.createFaculty("Sheehan", fullTime);
        personService.createFaculty("Braude", fullTime);
        personService.createFaculty("Kanabar", partTime);
        personService.createFaculty("Elentukh", partTime);
        personService.createFaculty("Kalathur", fullTime);
        personService.createFaculty("Zhang", fullTime);
        personService.createFaculty("Enxing", partTime);
        personService.createFaculty("Williams", partTime);
        personService.createFaculty("Winderbaum", partTime);
        personService.createFaculty("Rawassizadeh", fullTime);
        personService.createStudent("Anna");
        personService.createStudent("Brian");
        personService.createStudent("Charles");
        personService.createStudent("David");
        personService.createStudent("Ellen");
        personService.createStudent("Frank");
        personService.createStudent("George");
        personService.createStudent("Hannah");
        personService.createStudent("Ivy");
        personService.createStudent("Linda");
        personService.createStudent("Nancy");
        personService.createStudent("Mandy");
        personService.createStudent("Olivia");
        personService.createStudent("Peter");
        personService.createStudent("Tom");
        personService.createStudent("Rudy");
        personService.createStudent("Steve");
        personService.createStudent("Wendy");
        personService.createStudent("Yasmin");
        personService.createStudent("Zora");
    }
}
