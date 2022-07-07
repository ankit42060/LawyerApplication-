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
 

import com.lawyerinfo.lawyerinfo.Entity.Client;
import com.lawyerinfo.lawyerinfo.Repository.ClientRepository;
import com.lawyerinfo.lawyerinfo.Services.ClientServices;
import com.lawyerinfo.lawyerinfo.exception.ClientNotFoundException;
 
import com.lawyerinfo.lawyerinfo.lawyerdto.ClientDto;

 

@RestController
public class ClientController {
	
	@Autowired
	public ClientRepository clientrepository;
	
	@Autowired
	public ClientServices clientservices;
	 

	@PostMapping("/client/{lawyerId}")
	public Client addclient(@RequestBody @Valid ClientDto clientdto,@PathVariable int lawyerId) throws ClientNotFoundException {
		return clientservices.addclientinfo(clientdto,lawyerId);
	}
	
	
	@PutMapping("/updateclient/{id}")
	public Client updateclient(@RequestBody @Valid ClientDto clientdto,@PathVariable int id) {
		return clientservices.updateclientinfo(clientdto);
	}
	
	
	
	@GetMapping("/getbyclientname/{clientName}")
	public List<Client> getbyclientname(@PathVariable String clientName) throws ClientNotFoundException {
		return clientservices.getclientbynameinfo(clientName);
	}
	
	@GetMapping("/getbyclientage/{clientAge}")
	public List<Client> getbyclientage(@PathVariable int clientAge) throws ClientNotFoundException {
		return clientservices.getclientbyageinfo(clientAge);
	}
	
	@GetMapping("/getbyclientmobileno/{clientMobileNo}")
	public List<Client> getbyclientmobileno(@PathVariable String clientMobileNo) throws ClientNotFoundException {
		return clientservices.getclientbymobilenoinfo(clientMobileNo);
	}
	
	
	@GetMapping("/getbyclientnamestartswith/{clientName}")
	public List<Client> getbyclientnamestartswith(@PathVariable String clientName) throws ClientNotFoundException {
		return clientservices.getclientnamestartswith(clientName);
	}
	
	@GetMapping("/getbyclientnameendswith/{clientName}")
	public List<Client> getbyclientnameendswith(@PathVariable String clientName) throws ClientNotFoundException{
		return clientservices.getclientnameendswith(clientName);
	}
	
	@GetMapping("/getbyclientcontains/{clientName}")
	public List<Client> getbyclientcontains(@PathVariable String clientName) throws ClientNotFoundException{
		return clientservices.getclientcontains(clientName);
	}
	 
}
