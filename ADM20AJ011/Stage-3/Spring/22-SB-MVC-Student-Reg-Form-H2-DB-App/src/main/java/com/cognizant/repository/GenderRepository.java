package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.GenderDtlsEntity;
@Repository
public interface GenderRepository extends JpaRepository<GenderDtlsEntity, Integer> {
	@Query("select genderText from GenderDtlsEntity")
	List<String> getGenderText();
	
}
