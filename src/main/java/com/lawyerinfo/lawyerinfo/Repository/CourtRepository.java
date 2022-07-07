package com.lawyerinfo.lawyerinfo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawyerinfo.lawyerinfo.Entity.Court;

@Repository
public interface CourtRepository extends JpaRepository<Court, Integer> {

	List<Court> findByCourtName(String courtName);
	
	List<Court> findByCourtNameStartsWith(String courtName);
	
	List<Court> findByCourtNameEndsWith(String courtName);
	
	List<Court> findByCourtNameContains(String courtName);
}
