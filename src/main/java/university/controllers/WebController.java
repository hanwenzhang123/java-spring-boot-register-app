package university.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
