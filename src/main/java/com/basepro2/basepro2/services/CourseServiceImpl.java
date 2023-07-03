package com.basepro2.basepro2.services;

//import java.util.ArrayList;
//import java.util.stream.Collectors;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basepro2.basepro2.dao.CourseDao;
import com.basepro2.basepro2.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	//List<Course> list;
	
	public CourseServiceImpl()
	{
		/*
		 * list=new ArrayList<>(); list.add(new
		 * Course(145,"Java Core Course","This Course Contains basics of Java"));
		 * list.add(new
		 * Course(146,"Spring Boot Course","Creating Rest API using Spring Boot"));
		 */
	}

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	//@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		/*
		 * Course c=null; for(Course course:list) { if(course.getId()==courseId) {
		 * c=course; break; } }
		 */
		return courseDao.findById(courseId).orElse(null);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
		/*
		 * list.forEach(e -> { if(e.getId()==course.getId()) {
		 * e.setName(course.getName()); e.setDescription(course.getDescription()); } });
		 */
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		//@SuppressWarnings("deprecation")
		Course entity = courseDao.findById(parseLong).get();
		courseDao.delete(entity);
		
	}


}
