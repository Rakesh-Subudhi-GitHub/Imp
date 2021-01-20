package com.rk.entities;

public class Course {

	//properties
	private long id;
	private String title;
	private String description;
	
	public Course(long id, String title, String description) {
		System.out.println("all arument constructor calling in Course class::::");
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Course() {
		System.out.println("No argument constructor calling in Course class:::::");
		
	}

	//setters & getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//to string
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
}
