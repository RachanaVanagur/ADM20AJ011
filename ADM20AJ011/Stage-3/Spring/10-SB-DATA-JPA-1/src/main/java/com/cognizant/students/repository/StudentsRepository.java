package com.cognizant.students.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.students.entity.StudentsEntity;

@Repository
public interface StudentsRepository extends CrudRepository<StudentsEntity, Integer> {

}
