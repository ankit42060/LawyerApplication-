package com.lawyerinfo.lawyerinfo.lawyerdto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
 

import com.fasterxml.jackson.annotation.JsonBackReference;
 
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;

public class CourtDto {


 
	private int courtRegNo;
	
	 
	private String courtName; 
	
	 
	private String courtAddress;
	
	   
	private int noOfLawyer;

 


	public CourtDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public CourtDto(String courtName, String courtAddress, int noOfLawyer) {
		super();
		this.courtName = courtName;
		this.courtAddress = courtAddress;
		this.noOfLawyer = noOfLawyer;
	}




	public CourtDto(int courtRegNo, String courtName, String courtAddress, int noOfLawyer) {
		super();
		this.courtRegNo = courtRegNo;
		this.courtName = courtName;
		this.courtAddress = courtAddress;
		this.noOfLawyer = noOfLawyer;
	}




	public int getCourtRegNo() {
		return courtRegNo;
	}




	public void setCourtRegNo(int courtRegNo) {
		this.courtRegNo = courtRegNo;
	}




	public String getCourtName() {
		return courtName;
	}




	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}




	public String getCourtAddress() {
		return courtAddress;
	}




	public void setCourtAddress(String courtAddress) {
		this.courtAddress = courtAddress;
	}




	public int getNoOfLawyer() {
		return noOfLawyer;
	}




	public void setNoOfLawyer(int noOfLawyer) {
		this.noOfLawyer = noOfLawyer;
	}



 
}
