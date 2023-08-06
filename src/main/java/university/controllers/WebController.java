package university.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import university.models.Course;
import university.services.CourseService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@Controller
public class WebController {

    private final Logger log = LoggerFactory.getLogger(WebController.class);

//    @Autowired
//    private CourseService courseService;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

//    @GetMapping("/courses")
//    public List<Course> getAllCourses(){
//        return courseService.findAll();
//    }

//    @GetMapping("/course/{id}")
//    public ResponseEntity<?> getCourse(@PathVariable Long id) {
//        Optional<Course> course = courseService.findById(id);
//        return course.map(response -> ResponseEntity.ok().body(response))
//                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping("/course")
//    public ResponseEntity<Course> createCourse(@RequestBody Course course) throws URISyntaxException {
//        log.info("Request to create course: {}", course);
//        Course result = courseService.save(course);
//        return ResponseEntity.created(new URI("/api/course/" + result.getId()))
//                .body(result);
//    }
//
//    @PutMapping("/course/{id}")
//    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
//        log.info("Request to update course: {}", course);
//        Course result = courseService.save(course);
//        return ResponseEntity.ok().body(result);
//    }
//
//    @DeleteMapping("/course/{id}")
//    public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
//        log.info("Request to delete course: {}", id);
//        courseService.deleteById(id);
//        return ResponseEntity.ok().build();
//    }
}
