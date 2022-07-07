package com.lawyerinfo.lawyerinfo.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawyerinfo.lawyerinfo.Entity.Court;
import com.lawyerinfo.lawyerinfo.Repository.CourtRepository;
import com.lawyerinfo.lawyerinfo.exception.CourtNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.CourtDto;

@Service
public class CourtServices {
	
	@Autowired
	CourtRepository courtrepository;

	public Court addcourtinfo(CourtDto courtdto) {
		// TODO Auto-generated method stub
		Court court = new Court();
		court.setCourtName(courtdto.getCourtName());
		court.setCourtAddress(courtdto.getCourtAddress());
		court.setNoOfLawyer(courtdto.getNoOfLawyer());
		return courtrepository.save(court);
	}

	public Court updatecourtinfo(@Valid CourtDto courtdto, int courtRegNo) {
		// TODO Auto-generated method stub
		Court court = new Court();
		court.setCourtRegNo(courtdto.getCourtRegNo());
		court.setCourtName(courtdto.getCourtName());
		court.setCourtAddress(courtdto.getCourtAddress());
		court.setNoOfLawyer(courtdto.getNoOfLawyer());
		
		return courtrepository.save(court);
	}

	public List<Court> getbycourtname(String courtName) throws CourtNotFoundException {
		// TODO Auto-generated method stub
		if(courtrepository.findByCourtName(courtName).isEmpty()) {
			throw new CourtNotFoundException("court is Not Found");
		}else {
			return courtrepository.findByCourtName(courtName);
		}
		 
	}

	public List<Court> getbycourtnamestartswith(String courtName) throws CourtNotFoundException {
		// TODO Auto-generated method stub
		if(courtrepository.findByCourtNameStartsWith(courtName).isEmpty()) {
			throw new CourtNotFoundException("Court is Not Found");
		}else {
			return courtrepository.findByCourtNameStartsWith(courtName);
		}
		
	}

	public List<Court> getbycourtnameendswith(String courtName) throws CourtNotFoundException {
		// TODO Auto-generated method stub
		if(courtrepository.findByCourtNameEndsWith(courtName).isEmpty()) {
			throw new CourtNotFoundException("Court is Not Found");
		}else {
			return courtrepository.findByCourtNameEndsWith(courtName);
		}
		
	}

	public List<Court> getbycourtnamecontains(String courtName) throws CourtNotFoundException {
		// TODO Auto-generated method stub
		if(courtrepository.findByCourtNameContains(courtName).isEmpty()) {
			throw new CourtNotFoundException("Court is not present");
		}else {
			return courtrepository.findByCourtNameContains(courtName);
		}
		 
	}
	
	
	

}
