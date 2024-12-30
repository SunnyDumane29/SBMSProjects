package in.sunnyit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.binding.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
