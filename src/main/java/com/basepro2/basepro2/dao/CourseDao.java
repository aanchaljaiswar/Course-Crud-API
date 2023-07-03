package com.basepro2.basepro2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basepro2.basepro2.entities.Course;

@Repository

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
