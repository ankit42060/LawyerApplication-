package com.lawyerinfo.lawyerinfo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
 

 

@Entity
@Table(name="courtInfo")
public class Court {

	@Id
	@Column(name="Court_Reg_No")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courtRegNo;
	
	@Column(name="Court_Name")
	private String courtName; 
	
	@Column(name="Court_Address")
	private String courtAddress;
	
	@Column(name="No_Of_Lawyer")
	private int noOfLawyer;

	
	@OneToMany(mappedBy = "court",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Lawyer> lawyer;	


	public Court() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Court(String courtName, String courtAddress, int noOfLawyer) {
		super();
		this.courtName = courtName;
		this.courtAddress = courtAddress;
		this.noOfLawyer = noOfLawyer;
	}




	public Court(int courtRegNo, String courtName, String courtAddress, int noOfLawyer) {
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




	public List<Lawyer> getLawyer() {
		return lawyer;
	}




	public void setLawyer(List<Lawyer> lawyer) {
		this.lawyer = lawyer;
	}
	
	
	
	
 
	
	
	
	
}
