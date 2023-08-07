package university.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/courses")
    public String courses() {
        return "index";
    }
    @RequestMapping(value = "/students")
    public String students() {
        return "index";
    }
    @RequestMapping(value = "/faculties")
    public String faculties() {
        return "index";
    }
}
