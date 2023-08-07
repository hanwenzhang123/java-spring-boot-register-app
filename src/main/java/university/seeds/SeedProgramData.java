package university.seeds;

import university.services.RosterDAOService;

public class SeedProgramData {
    public SeedProgramData(RosterDAOService programService) {
        programService.deleteAllPrograms();
        programService.createUndergraduateProgram("Computer Science");
        programService.createUndergraduateProgram("Computer & Information Systems");
        programService.createGraduateProgram("Computer Science");
        programService.createGraduateProgram("Computer & Information Systems");
        programService.createCertificateProgram("Security");
        programService.createCertificateProgram("Web Technology");
        programService.createCertificateProgram("Project Management");
    }
}
