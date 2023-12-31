package university.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import university.models.abstracts.Program;
import university.services.RosterDAOService;

import java.util.ArrayList;
import java.util.List;
import university.seeds.SeedProgramData;
@RestController
@RequestMapping("/api")
public class ProgramController {
    private final Logger log = LoggerFactory.getLogger(ProgramController.class);

    @Autowired
    private RosterDAOService programService;

    @GetMapping("/programs")
    public List<Object[]> getAllPrograms(){
        new SeedProgramData(programService);
        Object[] list1 = getAllGraduatePrograms().toArray();
        Object[] list2 = getAllUndergraduatePrograms().toArray();
        Object[] list3 = getAllCertificatePrograms().toArray();
        ArrayList<Object[]> list = new ArrayList();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        return list;
    }
    @GetMapping("/programs-undergraduate")
    public List<Program> getAllUndergraduatePrograms(){
        return programService.getAllUndergraduatePrograms();
    }

    @GetMapping("/programs-graduate")
    public List<Program> getAllGraduatePrograms(){
        return programService.getAllGraduatePrograms();
    }

    @GetMapping("/programs-certificate")
    public List<Program> getAllCertificatePrograms(){
        return programService.getAllCertificatePrograms();
    }
}
