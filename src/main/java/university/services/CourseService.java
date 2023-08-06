package university.services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.models.Course;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseService extends JpaRepository<Course, Long>{
    List<Course> findByCourseCoordinator(String courseCoordinator);
    Optional<Course> findByCourseId(String courseId);
}