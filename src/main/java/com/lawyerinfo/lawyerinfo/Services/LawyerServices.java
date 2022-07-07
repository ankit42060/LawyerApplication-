package com.lawyerinfo.lawyerinfo.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lawyerinfo.lawyerinfo.Entity.Court;
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;
import com.lawyerinfo.lawyerinfo.Repository.CourtRepository;
import com.lawyerinfo.lawyerinfo.Repository.LawyerRepository;
import com.lawyerinfo.lawyerinfo.exception.ClientNotFoundException;
import com.lawyerinfo.lawyerinfo.exception.LawyerNotFoundException;
//import com.lawyerinfo.lawyerinfo.lawyerdto.LawyerDto;
import com.lawyerinfo.lawyerinfo.lawyerdto.LawyerDto;

@Service
public class LawyerServices {

	@Autowired
	public LawyerRepository lawyerrepository;
	
	@Autowired
	public CourtRepository courtrepository;

	public Lawyer addlawyerservice(LawyerDto lawyerdto,int courtRegNo) throws LawyerNotFoundException {

		Court court = courtrepository.findById(courtRegNo).orElseThrow(( ()-> new LawyerNotFoundException("client not found")));
		Lawyer lawyer = new Lawyer();
		
		lawyer.setLawyerName(lawyerdto.getLawyerName());
		lawyer.setLawyerAddress(lawyerdto.getLawyerAddress());
		lawyer.setLawyerAge(lawyerdto.getLawyerAge());
		lawyer.setLawyerMobileNo(lawyerdto.getLawyerMobileNo());
		// TODO Auto-generated method stub
		lawyer.setCourt(court);
		return lawyerrepository.save(lawyer);
	}

	public Lawyer updateLawyer(LawyerDto lawyerdto) {
		// TODO Auto-generated method stub
		Lawyer lawyer = new Lawyer();
		lawyer.setLawyerId(lawyerdto.getLawyerId());
		lawyer.setLawyerName(lawyerdto.getLawyerName());
		lawyer.setLawyerAddress(lawyerdto.getLawyerAddress());
		lawyer.setLawyerAge(lawyerdto.getLawyerAge());
		lawyer.setLawyerMobileNo(lawyerdto.getLawyerMobileNo());
		return lawyerrepository.save(lawyer);
	}

	public List<Lawyer> findbylawyername( String lawyerName) throws LawyerNotFoundException {
		// TODO Auto-generated method stub
		if (lawyerrepository.findByLawyerName(lawyerName).isEmpty()) {
			throw new LawyerNotFoundException("Lawyer is not present");
		} else {
			return lawyerrepository.findByLawyerName(lawyerName);
		}

	}

	public List<Lawyer> findbylawerage(int lawyerAge) throws LawyerNotFoundException {
		// TODO Auto-generated method stub
		if (lawyerrepository.findByLawyerAge(lawyerAge).isEmpty()) {
			throw new LawyerNotFoundException("Lawyer is not present");
		} else {
			return lawyerrepository.findByLawyerAge(lawyerAge);
		}

	}

	public List<Lawyer> findbylawyermobileno(long lawyerMobileNo) throws LawyerNotFoundException {
		if (lawyerrepository.findByLawyerMobileNo(lawyerMobileNo).isEmpty()) {
			throw new LawyerNotFoundException("Lawyer is not present");
		} else {
			// TODO Auto-generated method stub
			return lawyerrepository.findByLawyerMobileNo(lawyerMobileNo);
		}
	}
	

	public List<Lawyer> findbyStartsWith(String lawyerName) throws LawyerNotFoundException {
		// TODO Auto-generated method stub
		if(lawyerrepository.findByLawyerNameStartsWith(lawyerName).isEmpty()) {
			throw new LawyerNotFoundException("There is no name starting with this.....");
		}else {
			return lawyerrepository.findByLawyerNameStartsWith(lawyerName);
		}
		
	}

	public List<Lawyer> findbylawyerendswith(String lawyerName) throws LawyerNotFoundException {
		if(lawyerrepository.findByLawyerNameEndsWith(lawyerName).isEmpty()) {
			throw new LawyerNotFoundException("There is no name ending with this alphabets.....");
		}else {
			return lawyerrepository.findByLawyerNameEndsWith(lawyerName);
		}
		
	
	}

	public List<Lawyer> findbyContains(String lawyerName) throws LawyerNotFoundException {
		// TODO Auto-generated method stub
		if(lawyerrepository.findByLawyerNameContains(lawyerName).isEmpty()) {
			throw new LawyerNotFoundException("the words you search here is not found here");
		}else {
			return lawyerrepository.findByLawyerNameContains(lawyerName);
		}
		
		 
	}

	 
	
	 
	

}
