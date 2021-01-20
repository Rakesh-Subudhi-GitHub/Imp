package com.rk.service;

import java.util.List;

import com.rk.entities.Course;

public interface IServiceCourse {

	public List<Course> getCourse();
	
	public Course getCourses(long CourseId);
	
	public Course addNewCourse(Course course);
	
	public Course updateCourse(Course course);
}
