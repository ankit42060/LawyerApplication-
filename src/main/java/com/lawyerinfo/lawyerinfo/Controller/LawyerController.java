package com.lawyerinfo.lawyerinfo.Controller;

 

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lawyerinfo.lawyerinfo.Application;
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;
import com.lawyerinfo.lawyerinfo.Repository.LawyerRepository;
import com.lawyerinfo.lawyerinfo.Services.LawyerServices;
import com.lawyerinfo.lawyerinfo.exception.LawyerNotFoundException;
//import com.lawyerinfo.lawyerinfo.lawyerdto.LawyerDto;
import com.lawyerinfo.lawyerinfo.lawyerdto.LawyerDto;


 
@RestController
public class LawyerController {
	
	@Autowired
	public LawyerServices lawyerservice;
	
	@Autowired
	public LawyerRepository lawyerrepo;
	
	static Logger  logger = LogManager.getLogger(Application.class);

	@PostMapping("/lawyer/{courtRegNo}")
	public Lawyer addlawyer(@RequestBody @Valid LawyerDto lawyerdto,@PathVariable int courtRegNo) throws LawyerNotFoundException {
		return lawyerservice.addlawyerservice(lawyerdto,courtRegNo);
	}
 
	
	
	@PutMapping("/updatelawyer/{id}")
	
	
	public Lawyer updatelawyer(@RequestBody @Valid LawyerDto lawyerdto,@PathVariable int id) {
		
		
		return lawyerservice.updateLawyer(lawyerdto);
	}
	
	@GetMapping("/getbyname/{lawyerName}")
	public List<Lawyer> getLawyerName(@PathVariable String lawyerName) throws LawyerNotFoundException {
		logger.info("Controller Executing");	
		return lawyerservice.findbylawyername(lawyerName);
	}
	
	
	@GetMapping("/getbyage/{lawyerAge}")
	
	public List<Lawyer> getLawyerAge(@PathVariable int lawyerAge) throws LawyerNotFoundException {
		return lawyerservice.findbylawerage(lawyerAge);
	}
	
	@GetMapping("/getbylawyermobile/{lawyerMobileNo}")
	public List<Lawyer> getmobileno(@PathVariable long lawyerMobileNo) throws LawyerNotFoundException {
		return lawyerservice.findbylawyermobileno(lawyerMobileNo);
	}
	
	@GetMapping("/getbylawyername/{lawyerName}")
	public List<Lawyer> getstartsname(@PathVariable String lawyerName) throws LawyerNotFoundException {
		return lawyerservice.findbyStartsWith(lawyerName);
	}
	
	
	@GetMapping("/lawyernameendswith/{lawyerName}")
	public List<Lawyer> getendsname(@PathVariable String lawyerName) throws LawyerNotFoundException {
		return lawyerservice.findbylawyerendswith(lawyerName);
	}
	
	@GetMapping("/lawyernamecontains/{lawyerName}")
	public List<Lawyer> getlawyerscontain(@PathVariable String lawyerName) throws LawyerNotFoundException {
		return lawyerservice.findbyContains(lawyerName);
	}
	
	
	
}
