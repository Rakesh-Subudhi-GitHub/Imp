package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rk.entities.Course;

@Service("courService")
public class CourseImpl implements IServiceCourse{

	List<Course> list;
	
	public CourseImpl() {
		System.out.println("0-param constructor load");
		
		list=new ArrayList<>();
		
		//add couses of list
		list.add(new Course(100, "java course", "java"));
		list.add(new Course(101,"python course","python"));
		list.add(new Course(102, "php courses", "php"));
		list.add(new Course(103, ".net course", ".net"));
		
	}
	@Override
	public List<Course> getCourse() {
		
		return list;
	}
	
	
	@Override
	public Course getCourses(long CourseId) {
		
		Course c=null;
		
		//check CourseID match or not
		for(Course course:list)
		{
			if(course.getId()==CourseId)
			{
				c=course;
				break;
			}
				
		}
		return c;
	}
	@Override
	public Course addNewCourse(Course course) {
		
		list.add(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
	
		list.forEach(e->{
			if(e.getId()==course.getId())
				
				//change update 		
				{
					e.setTitle(course.getTitle());
					e.setDescription(course.getDescription());	
				}
		});
		
		
		return course;
	}

}
