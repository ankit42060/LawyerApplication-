package com.lawyerinfo.lawyerinfo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lawyerinfo.lawyerinfo.Entity.Case;
import com.lawyerinfo.lawyerinfo.Services.CaseService;
import com.lawyerinfo.lawyerinfo.exception.CaseNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.CaseDto;

@RestController
public class CaseController {
	
	@Autowired 
	CaseService caseservice;

	@PostMapping("/addcase/{lawyerId}")
	public Case addcase(@RequestBody @Valid CaseDto casedto,@PathVariable int lawyerId) throws CaseNotFoundException {
		return caseservice.addcaseinformation(casedto,lawyerId);
	}
	
	@PutMapping("/updatecase/{caseId}")
	public Case updatecase(@RequestBody @Valid CaseDto casedto, int caseId) {
		return caseservice.updatecaseinformation(casedto,caseId);
	}
	
	@GetMapping("/getcaseinformations")
	public List<Case> getcaseinformation(Case caseinfo){
		return caseservice.getcaseallinformation(caseinfo);
	}
	
	@GetMapping("/getcasebyname/{caseName}")
	public List<Case> getcasebyname(@PathVariable String caseName) throws CaseNotFoundException{
		return caseservice.getbycasename(caseName);
	}
	
	@GetMapping("/getcasebynoofcase/{noOfCase}")
	public List<Case> getcasebynoofcase(@PathVariable int noOfCase) throws CaseNotFoundException{
		return caseservice.getcasebynoofcase(noOfCase);
	}
	
	@GetMapping("/getcasehandlername/{caseHandlerName}")
	public List<Case> getcasehandlername(@PathVariable String caseHandlerName) throws CaseNotFoundException{
		return caseservice.getcasehandlernameinfo(caseHandlerName);
	}
	
	@GetMapping("/getcasehandlernamestartswith/{caseHandlerName}")
	public List<Case> getcasehandlernamestartswith(@PathVariable String caseHandlerName) throws CaseNotFoundException{
		return caseservice.getcasehandlernamestartswith(caseHandlerName);
	}
	
	@GetMapping("/getcasehandlernameendswith/{caseHandlerName}")
	public List<Case> getcasehandlernameendswith(@PathVariable String caseHandlerName) throws CaseNotFoundException{
		return caseservice.getcasehandlernameendswith(caseHandlerName);
	}
	
	@GetMapping("/getcasehandlernamecontains/{caseHandlerName}")
	public List<Case> getcasehandlernamecontains(@PathVariable String caseHandlerName) throws CaseNotFoundException{
		return caseservice.getcasehandlernamecontains(caseHandlerName);
	}
	
}
