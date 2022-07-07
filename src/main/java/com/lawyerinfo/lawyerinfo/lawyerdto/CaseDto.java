package com.lawyerinfo.lawyerinfo.lawyerdto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CaseDto {

 
	private int caseId;
	
	 
	private String caseName;
	
	 
	private int noOfCase;
	
	 
	private String caseInformation;
	
	@Column(name="Case_Handler_Name")
	private String caseHandlerName;
	
	public CaseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public CaseDto(String caseName, int noOfCase, String caseInformation, String caseHandlerName) {
		super();
		this.caseName = caseName;
		this.noOfCase = noOfCase;
		this.caseInformation = caseInformation;
		this.caseHandlerName = caseHandlerName;
	}





	public CaseDto(int caseId, String caseName, int noOfCase, String caseInformation, String caseHandlerName) {
		super();
		this.caseId = caseId;
		this.caseName = caseName;
		this.noOfCase = noOfCase;
		this.caseInformation = caseInformation;
		this.caseHandlerName = caseHandlerName;
	}





	public int getCaseId() {
		return caseId;
	}





	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}





	public String getCaseName() {
		return caseName;
	}





	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}





	public int getNoOfCase() {
		return noOfCase;
	}





	public void setNoOfCase(int noOfCase) {
		this.noOfCase = noOfCase;
	}





	public String getCaseInformation() {
		return caseInformation;
	}





	public void setCaseInformation(String caseInformation) {
		this.caseInformation = caseInformation;
	}





	public String getCaseHandlerName() {
		return caseHandlerName;
	}





	public void setCaseHandlerName(String caseHandlerName) {
		this.caseHandlerName = caseHandlerName;
	}
	
	
	
	
	
}
