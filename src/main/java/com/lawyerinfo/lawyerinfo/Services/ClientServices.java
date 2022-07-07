package com.lawyerinfo.lawyerinfo.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawyerinfo.lawyerinfo.Entity.Client;
import com.lawyerinfo.lawyerinfo.Entity.Lawyer;
import com.lawyerinfo.lawyerinfo.Repository.ClientRepository;
import com.lawyerinfo.lawyerinfo.Repository.LawyerRepository;
import com.lawyerinfo.lawyerinfo.exception.ClientNotFoundException;
import com.lawyerinfo.lawyerinfo.lawyerdto.ClientDto;

@Service
public class ClientServices {
	
	@Autowired
	public ClientRepository clientrepository;
	
	@Autowired
	public LawyerRepository lawyerrepository;

	public Client addclientinfo(ClientDto clientdto,int lawyerId) throws ClientNotFoundException {
		System.out.println("lawyerinformation");
		Lawyer lawyer = lawyerrepository.findById(lawyerId).orElseThrow(( ()-> new ClientNotFoundException("client not found")));
		// TODO Auto-generated method stub
		
		Client client = new Client();
		 
		client.setClientName(clientdto.getClientName());
		client.setClientAge(clientdto.getClientAge());
		client.setClientAddress(clientdto.getClientAddress());
		client.setClientMobileNo(clientdto.getClientMobileNo());
		System.out.println("lawyer information 2");
		client.setLawyer(lawyer);
		System.out.println("lawyer name is"+lawyer);
		return clientrepository.save(client);
	}

	public Client updateclientinfo(ClientDto clientdto) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.setClientId(clientdto.getClientId());
		client.setClientName(clientdto.getClientName());
		client.setClientAge(clientdto.getClientAge());
		client.setClientAddress(clientdto.getClientAddress());
		client.setClientMobileNo(clientdto.getClientMobileNo());
		return clientrepository.save(client);
	}

	public List<Client> getclientbynameinfo(String clientName) throws ClientNotFoundException {
		// TODO Auto-generated method stub
		if(clientrepository.findByClientName(clientName).isEmpty()) {
			throw new ClientNotFoundException("Client Not Found");
		}else {
			return clientrepository.findByClientName(clientName);
		}
		
	}

	public List<Client> getclientbyageinfo(int clientAge) throws ClientNotFoundException {
		
		if(clientrepository.findByClientAge(clientAge).isEmpty()) {
			throw new ClientNotFoundException("Client Not Found");
		}else {
			return clientrepository.findByClientAge(clientAge);
		}
		
		 
	}

	public List<Client> getclientbymobilenoinfo(String clientMobileNo) throws ClientNotFoundException {
		// TODO Auto-generated method stub
		if(clientrepository.findByClientMobileNo(clientMobileNo).isEmpty()) {
			throw new ClientNotFoundException("Client Not Found");
		}else {
			return clientrepository.findByClientMobileNo(clientMobileNo);
		}
		 
	}

	public List<Client> getclientnamestartswith(String clientName) throws ClientNotFoundException {
		// TODO Auto-generated method stub
		if(clientrepository.findByClientNameStartsWith(clientName).isEmpty()) {
			throw new ClientNotFoundException("Client Not Found");
		}else {
			return clientrepository.findByClientNameStartsWith(clientName);
		}
		
	}

	public List<Client> getclientnameendswith(String clientName) throws ClientNotFoundException {
		if(clientrepository.findByClientNameEndsWith(clientName).isEmpty()) {
			throw new ClientNotFoundException("client Not Found");
		}else {
			return clientrepository.findByClientNameEndsWith(clientName);
		}
		// TODO Auto-generated method stub
		 
	}

	public List<Client> getclientcontains(String clientName) throws ClientNotFoundException {
		// TODO Auto-generated method stub
		if(clientrepository.findByClientNameContains(clientName).isEmpty()) {
			throw new ClientNotFoundException("Client Not Found");
		}else {
			return clientrepository.findByClientNameContains(clientName);
		}
		 
	}
 

}
