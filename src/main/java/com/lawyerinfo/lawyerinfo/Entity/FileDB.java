package com.lawyerinfo.lawyerinfo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="files")
public class FileDB {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String type;
	
	@Lob
	private byte[] fileContent;
	
	
	@ManyToOne
	@JoinColumn(name="client_clientId")
	
	@JsonManagedReference
	
	private Client client;


	public FileDB() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FileDB(String name, String type, byte[] fileContent) {
		super();
		this.name = name;
		this.type = type;
		this.fileContent = fileContent;
	}


	public FileDB(long id, String name, String type, byte[] fileContent) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.fileContent = fileContent;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public byte[] getFileContent() {
		return fileContent;
	}


	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	 
	 
}
