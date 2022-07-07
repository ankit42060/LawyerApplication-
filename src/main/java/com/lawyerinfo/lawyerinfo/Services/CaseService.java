package com.lawyerinfo.lawyerinfo.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawyerinfo.lawyerinfo.Entity.Case;
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;
import com.lawyerinfo.lawyerinfo.Repository.CaseRepository;
import com.lawyerinfo.lawyerinfo.Repository.LawyerRepository;
import com.lawyerinfo.lawyerinfo.exception.CaseNotFoundException;
import com.lawyerinfo.lawyerinfo.exception.ClientNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.CaseDto;

@Service
public class CaseService {
	
	@Autowired
	CaseRepository caserepository;
	
	@Autowired
	public LawyerRepository lawywerrepository;

	public Case addcaseinformation(CaseDto casedto,int lawyerId) throws CaseNotFoundException{
		// TODO Auto-generated method stub
		 Lawyer lawyer = lawywerrepository.findById(lawyerId).orElseThrow(( ()-> new CaseNotFoundException("case not found")));
		 Case cas = new Case();
		 cas.setCaseName(casedto.getCaseName());
		 cas.setNoOfCase(casedto.getNoOfCase());
		 cas.setCaseInformation(casedto.getCaseInformation());
		 cas.setCaseHandlerName(casedto.getCaseHandlerName());
		 cas.setLawyer(lawyer);
		 return caserepository.save(cas);
	}

	public Case updatecaseinformation(@Valid CaseDto casedto, int caseId) {
		// TODO Auto-generated method stub
		Case cas = new Case();
		cas.setCaseId(casedto.getCaseId());
		cas.setCaseName(casedto.getCaseName());
		cas.setNoOfCase(casedto.getNoOfCase());
		cas.setCaseInformation(casedto.getCaseInformation());
		cas.setCaseHandlerName(casedto.getCaseHandlerName());
		return caserepository.save(cas);
	}

	public List<Case> getcaseallinformation(Case caseinfo) {
		// TODO Auto-generated method stub
		return caserepository.findAll();
	}

	public List<Case> getbycasename(String caseName) throws CaseNotFoundException {
		// TODO Auto-generated method stub
		if(caserepository.findByCaseName(caseName).isEmpty()) {
			throw new CaseNotFoundException("Case Is Nof Found");
		}else {
			return caserepository.findByCaseName(caseName);
		}
		 
	}

	public List<Case> getcasebynoofcase(int noOfCase) throws CaseNotFoundException {
		// TODO Auto-generated method stub
		if(caserepository.findCaseByNoOfCase(noOfCase).isEmpty()) {
			throw new CaseNotFoundException("no of case not available");
		}else {
			return caserepository.findCaseByNoOfCase(noOfCase);
		}
		
		
	}

	public List<Case> getcasehandlernameinfo(String caseHandlerName) throws CaseNotFoundException {
		// TODO Auto-generated method stub
		if(caserepository.findByCaseHandlerName(caseHandlerName).isEmpty()) {
			throw new CaseNotFoundException("Case Handler Name not found");
		}else {
			return caserepository.findByCaseHandlerName(caseHandlerName);
		}
		 
	}

	public List<Case> getcasehandlernamestartswith(String caseHandlerName) throws CaseNotFoundException {
		// TODO Auto-generated method stub
		if(caserepository.findByCaseHandlerNameStartsWith(caseHandlerName).isEmpty()) {
			throw new CaseNotFoundException("Your searching name is not found");
		}else {
			return caserepository.findByCaseHandlerNameStartsWith(caseHandlerName);
		}
		 
	}

	public List<Case> getcasehandlernameendswith(String caseHandlerName) throws CaseNotFoundException {
		// TODO Auto-generated method stub
		if(caserepository.findByCaseHandlerNameEndsWith(caseHandlerName).isEmpty()) {
			throw new CaseNotFoundException("Your searching ends name is not found");
		}else {
			return caserepository.findByCaseHandlerNameEndsWith(caseHandlerName);
		}
		 
	}

	public List<Case> getcasehandlernamecontains(String caseHandlerName) throws CaseNotFoundException {
		// TODO Auto-generated method stub
		if(caserepository.findByCaseHandlerNameContains(caseHandlerName).isEmpty()) {
			throw new CaseNotFoundException("Your searching contains name is not found");
		}else {
			return caserepository.findByCaseHandlerNameContains(caseHandlerName);
		}
		 
	}

 
	
}
