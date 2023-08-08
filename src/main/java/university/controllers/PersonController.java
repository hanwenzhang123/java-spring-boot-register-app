package university.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import university.models.abstracts.Person;
import university.seeds.SeedPersonData;
import university.services.RosterDAOService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    private final Logger log = LoggerFactory.getLogger(PersonController.class);
    @Autowired
    private RosterDAOService personService;

    @GetMapping("/people")
    public ArrayList<Object[]> getAllPeople(){
        new SeedPersonData(personService);
        Object[] list1 = getAllStudents().toArray();
        Object[] list2 = getAllFaculties().toArray();
        ArrayList<Object[]> list = new ArrayList();
        list.add(list1);
        list.add(list2);
        return list;
    }

    @GetMapping("/students")
    public List<Person> getAllStudents(){
        return personService.getAllStudents();
    }
    @GetMapping("/faculties")
    public List<Person> getAllFaculties(){
        return personService.getAllFaculties();
    }
}
