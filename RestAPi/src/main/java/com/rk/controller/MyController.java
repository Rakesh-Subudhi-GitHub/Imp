package com.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.entities.Course;
import com.rk.service.IServiceCourse;

@RestController
public class MyController {

	@Autowired
	private IServiceCourse service;
	
	//Get request method calling 
	@GetMapping("/home")
	public String home()
	{
		return "This is my home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourse(){
		
		return service.getCourse();
	}//method
	
	@GetMapping("/courses/{coursesId}")
	public Course getCourse(@PathVariable String coursesId)
	{
		//courseId come in String so convert to fast long
		long CourseId=Long.parseLong(coursesId);
		
		return service.getCourses(CourseId);
	}
	
	@PostMapping("/courses")
	public Course addNewCourses(@RequestBody Course course)
	{
		return this.service.addNewCourse(course);
	}
	
	@PutMapping("/courses")
	public Course UpdateCourse(@RequestBody Course course)
	{
		return service.updateCourse(course);
	}
}//control class
