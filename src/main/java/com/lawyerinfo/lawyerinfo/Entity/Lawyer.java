package com.lawyerinfo.lawyerinfo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
 
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

 

@Entity
@Table(name="lawyerInfo")

public class Lawyer {

	@Id
	@Column(name="Lawyer_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int lawyerId;
	
	@Column(name="Lawyer_Name")
	private String lawyerName;
	
	@Column(name="Lawyer_Address")
	private String lawyerAddress;
	
	@Column(name="Lawyer_Age")
	private int lawyerAge;
	
	@Column(name="Laywer_Mobile_No")
	private long lawyerMobileNo;
	
	@OneToMany(mappedBy = "lawyer",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Client> clients;
	
	@OneToMany(mappedBy = "lawyer",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Case> caseinfo;
	
	@ManyToOne
	@JoinColumn(name="judge_judgeId")
	@JsonManagedReference
	private Judge judge;
	
	
	@ManyToOne
	@JoinColumn(name="court_courtRegNo")
	
	@JsonManagedReference
	
	private Court court;

	public Lawyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Lawyer(String lawyerName, String lawyerAddress, int lawyerAge, long lawyerMobileNo) {
		super();
		this.lawyerName = lawyerName;
		this.lawyerAddress = lawyerAddress;
		this.lawyerAge = lawyerAge;
		this.lawyerMobileNo = lawyerMobileNo;
	}



	public Lawyer(int lawyerId, String lawyerName, String lawyerAddress, int lawyerAge, long lawyerMobileNo) {
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



	public Court getCourt() {
		return court;
	}



	public void setCourt(Court court) {
		this.court = court;
	}



	public List<Client> getClients() {
		return clients;
	}



	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	 
	
	
	
	
}
