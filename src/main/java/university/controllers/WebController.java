package university.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
