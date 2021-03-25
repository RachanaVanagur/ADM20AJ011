package com.cognizant.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.CourseDtlsEntity;
@Repository
public interface CourseRepository extends JpaRepository<CourseDtlsEntity, Serializable> {
	@Query("select courseName from CourseDtlsEntity")
	List<String> getCourseNames();
}
