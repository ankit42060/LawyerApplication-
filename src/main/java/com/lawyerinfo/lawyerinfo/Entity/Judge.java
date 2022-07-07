package com.lawyerinfo.lawyerinfo.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="JudgeInfo")
public class Judge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int judgeId;
	private String judgeName;
	
	
	
	
	@OneToMany(mappedBy = "judge",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Lawyer> lawyerdemo;


	public Judge() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Judge(String judgeName) {
		super();
		this.judgeName = judgeName;
	}

 
	public int getJudgeId() {
		return judgeId;
	}


	public void setJudgeId(int judgeId) {
		this.judgeId = judgeId;
	}


	public String getJudgeName() {
		return judgeName;
	}


	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}

	public List<Lawyer> getLawyerdemo() {
		return lawyerdemo;
	}


	public void setLawyerdemo(List<Lawyer> lawyerdemo) {
		this.lawyerdemo = lawyerdemo;
	}


	 
	
	 


	 
	
	
	
}
