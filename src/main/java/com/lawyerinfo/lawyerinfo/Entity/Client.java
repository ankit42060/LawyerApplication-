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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="clientInfo")
public class Client {
	
	@Id
	@Column(name="Client_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	
	@Column(name="Client_Name")
	private String clientName;
	
	@Column(name="Client_Age")
	private int clientAge;
	
	@Column(name="Client_Address")
	private String clientAddress;
	
	@Column(name="Client_MobileNo")
	private String clientMobileNo;

	@ManyToOne
	@JoinColumn(name="lawyer_lawyerId")
	@JsonManagedReference
	private Lawyer lawyer;
	
	
	@OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<FileDB> filedb;
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String clientName, int clientAge, String clientAddress, String clientMobileNo) {
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientAddress = clientAddress;
		this.clientMobileNo = clientMobileNo;
	}

	public Client(int clientId, String clientName, int clientAge, String clientAddress, String clientMobileNo) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientAddress = clientAddress;
		this.clientMobileNo = clientMobileNo;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getClientAge() {
		return clientAge;
	}

	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientMobileNo() {
		return clientMobileNo;
	}

	public void setClientMobileNo(String clientMobileNo) {
		this.clientMobileNo = clientMobileNo;
	}

	public Lawyer getLawyer() {
		return lawyer;
	}

	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}
	
	
	
 
	
 

}
