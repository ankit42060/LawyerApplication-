package com.lawyerinfo.lawyerinfo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lawyerinfo.lawyerinfo.Entity.Court;
import com.lawyerinfo.lawyerinfo.Services.CourtServices;
import com.lawyerinfo.lawyerinfo.exception.CourtNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.CourtDto;

@RestController
public class CourtController {
	
	@Autowired
	CourtServices courtservices;

	@PostMapping("/addcourtinfo")	
	public Court addcourtinfo(@RequestBody @Valid CourtDto courtdto) {
		return courtservices.addcourtinfo(courtdto);
	}
	
	@PutMapping("/updatecourtinfo/{courtRegNo}")
	public Court updatecourtinfo(@RequestBody @Valid CourtDto courtdto,@PathVariable int courtRegNo) {
		return courtservices.updatecourtinfo(courtdto,courtRegNo);
	}
	
	@GetMapping("/getbyCourtName/{courtName}")
	public List<Court> getByCourtName(@PathVariable String courtName) throws CourtNotFoundException{
		return courtservices.getbycourtname(courtName);
	}
	
	@GetMapping("/getbyCourtNameStartsWith/{courtName}")
	public List<Court> getByCourtNameStartsWith(@PathVariable String courtName) throws CourtNotFoundException{
		return courtservices.getbycourtnamestartswith(courtName);
	}
	
	@GetMapping("/getbyCourtNameEndsWith/{courtName}")
	public List<Court> getByCourtNameEndsWith(@PathVariable String courtName) throws CourtNotFoundException{
		return courtservices.getbycourtnameendswith(courtName);
	}
	
	
	
	@GetMapping("/getbyCourtNameContains/{courtName}")
	public List<Court> getByCourtNameContains(@PathVariable String courtName) throws CourtNotFoundException{
		return courtservices.getbycourtnamecontains(courtName);
	}
	
}
