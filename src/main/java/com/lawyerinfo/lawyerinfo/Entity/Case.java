package com.lawyerinfo.lawyerinfo.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="CaseInfo")
public class Case {
	
	@Id
	@Column(name="Case_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int caseId;
	
	@Column(name="Case_Name")
	private String caseName;
	
	@Column(name="No_Of_Case")
	private int noOfCase;
	
	@Column(name="Case_Information")
	private String caseInformation;
	
	@Column(name="Case_Handler_Name")
	private String caseHandlerName;
	
	@Column
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="lawyer_lawyerId")
	@JsonManagedReference
	private Lawyer lawyer;
 
	
	public Case() {
		
	}
	
	
	
	

	public Case(String caseName, int noOfCase, String caseInformation, String caseHandlerName) {
		super();
		this.caseName = caseName;
		this.noOfCase = noOfCase;
		this.caseInformation = caseInformation;
		this.caseHandlerName = caseHandlerName;
	}





	public Case(int caseId, String caseName, int noOfCase, String caseInformation, String caseHandlerName) {
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





	public Lawyer getLawyer() {
		return lawyer;
	}





	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}
	
	
	
	
	
	
	

}
