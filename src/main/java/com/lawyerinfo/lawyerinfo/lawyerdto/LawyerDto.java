package com.lawyerinfo.lawyerinfo.lawyerdto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
 
 

 

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.lawyerinfo.lawyerinfo.Entity.Client;
import com.lawyerinfo.lawyerinfo.Entity.Court;

 

public class LawyerDto {

 
	
	private int lawyerId;
	
	 
	private String lawyerName;
	
	 
	private String lawyerAddress;
	
	  
	private int lawyerAge;
	
	 
	private long lawyerMobileNo;
	
	 
	 
	
	
 
	
	 

	public LawyerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public LawyerDto(String lawyerName, String lawyerAddress, int lawyerAge, long lawyerMobileNo) {
		super();
		this.lawyerName = lawyerName;
		this.lawyerAddress = lawyerAddress;
		this.lawyerAge = lawyerAge;
		this.lawyerMobileNo = lawyerMobileNo;
	}



	public LawyerDto(int lawyerId, String lawyerName, String lawyerAddress, int lawyerAge, long lawyerMobileNo) {
		super();
		this.lawyerId = lawyerId;
		this.lawyerName = lawyerName;
		this.lawyerAddress = lawyerAddress;
		this.lawyerAge = lawyerAge;
		this.lawyerMobileNo = lawyerMobileNo;
	}



	public int getLawyerId() {
		return lawyerId;
	}



	public void setLawyerId(int lawyerId) {
		this.lawyerId = lawyerId;
	}



	public String getLawyerName() {
		return lawyerName;
	}



	public void setLawyerName(String lawyerName) {
		this.lawyerName = lawyerName;
	}



	public String getLawyerAddress() {
		return lawyerAddress;
	}



	public void setLawyerAddress(String lawyerAddress) {
		this.lawyerAddress = lawyerAddress;
	}



	public int getLawyerAge() {
		return lawyerAge;
	}



	public void setLawyerAge(int lawyerAge) {
		this.lawyerAge = lawyerAge;
	}



	public long getLawyerMobileNo() {
		return lawyerMobileNo;
	}



	public void setLawyerMobileNo(long lawyerMobileNo) {
		this.lawyerMobileNo = lawyerMobileNo;
	}



	 

	 
	

	
	
}
