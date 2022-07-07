package com.lawyerinfo.lawyerinfo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawyerinfo.lawyerinfo.Entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
	
	 

	List<Client> findByClientName(String clientName);
	
	List<Client> findByClientAge(int clientAge);
	
	List<Client> findByClientMobileNo(String clientMobileNo);
	
	List<Client> findByClientNameStartsWith(String clientName);
	
	List<Client> findByClientNameEndsWith(String clientName);
	
	List<Client> findByClientNameContains(String clientName);
}
