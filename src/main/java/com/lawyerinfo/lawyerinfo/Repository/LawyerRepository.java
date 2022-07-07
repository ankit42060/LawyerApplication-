package com.lawyerinfo.lawyerinfo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawyerinfo.lawyerinfo.Entity.Lawyer;
 

public interface LawyerRepository extends JpaRepository<Lawyer, Integer> {

	List<Lawyer> findByLawyerName(String lawyerName);
	
	List<Lawyer> findByLawyerAge(int lawyerAge);
	
	List<Lawyer> findByLawyerMobileNo(long lawyerMobileNo);
	
	List<Lawyer> findByLawyerNameStartsWith(String lawyerName);
	
	
	List<Lawyer> findByLawyerNameEndsWith(String lawyerName);
	
	List<Lawyer> findByLawyerNameContains(String lawyerName);
 

}
