package com.lawyerinfo.lawyerinfo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawyerinfo.lawyerinfo.Entity.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Integer> {

	List<Case> findByCaseName(String caseName);
	
	List<Case> findCaseByNoOfCase(int noOfCase);
	
	List<Case> findByCaseHandlerName(String caseHandlerName);
	
	List<Case> findByCaseHandlerNameStartsWith(String caseHandlerName);
	
	List<Case> findByCaseHandlerNameEndsWith(String caseHandlerName);
	
	List<Case> findByCaseHandlerNameContains(String caseHandlerName);
	
	

	 
}
