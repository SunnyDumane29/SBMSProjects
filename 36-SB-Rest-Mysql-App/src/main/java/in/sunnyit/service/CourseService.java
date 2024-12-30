package in.sunnyit.service;

import java.util.List;

import in.sunnyit.binding.Course;

public interface CourseService {

	
	public String upsert(Course course); // insert + Update
	
	public Course getById(Integer cid); // get course by ID
	
	public List<Course> getAllCourses(); // get all coursess frome DB
	
	public String deleteById(Integer cid); // to delete coyrse by id
	
	
	
}
