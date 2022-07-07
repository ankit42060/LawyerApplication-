package com.lawyerinfo.lawyerinfo.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lawyerinfo.lawyerinfo.Entity.Judge;
 
import com.lawyerinfo.lawyerinfo.Services.JudgeService;
import com.lawyerinfo.lawyerinfo.exception.LawyerNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.JudgeDto;

@RestController
public class JudgeController {
	
	@Autowired
	public JudgeService judgeservice;

	@PostMapping("/addjudge/{lawyerId}")
	public Judge addjudge(@RequestBody @Valid JudgeDto judgedto,@PathVariable int lawyerId) throws LawyerNotFoundException {
		return judgeservice.addjudgeinformation(judgedto,lawyerId);
	}
}
