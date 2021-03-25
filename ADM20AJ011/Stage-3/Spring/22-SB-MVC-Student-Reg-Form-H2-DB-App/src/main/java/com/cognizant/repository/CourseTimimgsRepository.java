package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.entity.CourseTimingsEntity;

public interface CourseTimimgsRepository extends JpaRepository<CourseTimingsEntity, Integer> {
	@Query("select timing from CourseTimingsEntity")
	List<String> getCourseTimings();
}
