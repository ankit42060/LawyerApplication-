package com.lawyerinfo.lawyerinfo.Services;

 

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawyerinfo.lawyerinfo.Entity.Judge;
 
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;
import com.lawyerinfo.lawyerinfo.Repository.JudgeRepository;
import com.lawyerinfo.lawyerinfo.Repository.LawyerRepository;
import com.lawyerinfo.lawyerinfo.exception.LawyerNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.JudgeDto;

@Service
public class JudgeService {
	
	@Autowired
	public JudgeRepository judgerepository;
	
	@Autowired
	public LawyerRepository lawyerrepository;

	public Judge addjudgeinformation( JudgeDto judgedto,int lawyerId) throws LawyerNotFoundException {
		// TODO Auto-generated method stub
		
		
		Judge judgeinfo = new Judge(judgedto.getJudgeName());
		List<Lawyer> lawyers = lawyerrepository.findAll();
		judgeinfo.setLawyerdemo(lawyers);
	
		System.out.println("lawyer information storage!!!"+lawyers);
		return judgerepository.save(judgeinfo);
	}

	
}
