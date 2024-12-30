package in.sunnyit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Course;
import in.sunnyit.service.CourseService;

@RestController
public class CourseRestController {

	@Autowired
	private CourseService courseService;
	
	
	@PostMapping(value = "/course")
	public ResponseEntity <String>cretaeCourse(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping (value = "/course/{cid}")
	public ResponseEntity <Course> getCourse(@PathVariable Integer cid)
	{
		Course courseData = courseService.getById(cid);
		
		return new ResponseEntity<>(courseData,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/courses")
	public ResponseEntity <List<Course>> getAllCoursess()
	{
		List<Course> allCourses = courseService.getAllCourses();
		
		return new ResponseEntity<>(allCourses,HttpStatus.OK);
		
		
	}
	
	@PutMapping(value = "/course")
	public ResponseEntity <String>updateCourse(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	
	@DeleteMapping (value = "/course/{cid}")
	public ResponseEntity <String> deleteCourse(@PathVariable Integer cid)
	{
		String status = courseService.deleteById(cid);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
		
	}
}
