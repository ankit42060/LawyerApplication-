package com.lawyerinfo.lawyerinfo.lawyerdto;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class JudgeDto {

	 
	private int judgeId;
	
	 
	private String judgeName;
	
	 
	 

	public JudgeDto() {
		super();
		// TODO Auto-generated constructor stub
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
 
	
}
