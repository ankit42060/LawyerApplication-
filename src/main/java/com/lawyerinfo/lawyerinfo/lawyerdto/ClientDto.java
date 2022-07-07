package com.lawyerinfo.lawyerinfo.lawyerdto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 
 

 
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;

public class ClientDto {


 
	private int clientId;
	
	 
	private String clientName;
	
	 
	private int clientAge;
	
	 
	private String clientAddress;
	
	 
	private String clientMobileNo;


	public ClientDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ClientDto(String clientName, int clientAge, String clientAddress, String clientMobileNo) {
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientAddress = clientAddress;
		this.clientMobileNo = clientMobileNo;
	}


	public ClientDto(int clientId, String clientName, int clientAge, String clientAddress, String clientMobileNo) {
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

	 
	 
	
	
	
	
	
	
}
