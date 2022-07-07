package com.lawyerinfo.lawyerinfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawyerinfo.lawyerinfo.Entity.Judge;
 

@Repository
public interface JudgeRepository extends JpaRepository<Judge, Integer> {

}
