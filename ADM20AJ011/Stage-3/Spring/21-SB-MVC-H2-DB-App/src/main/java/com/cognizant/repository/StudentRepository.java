package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
