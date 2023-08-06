package university.services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.models.Course;

@Repository
public interface CourseService extends JpaRepository<Course, Long>{

}