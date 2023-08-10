package university.services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import university.models.Course;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseService extends CrudRepository<Course, Long> {
    List<Course> findByCourseCoordinator(String courseCoordinator);
    Optional<Course> findByCourseNumber(String courseNumber);
}