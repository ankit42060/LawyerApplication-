package com.lawyerinfo.lawyerinfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

@SpringBootApplication	
@EnableAutoConfiguration
public class Application {
	
	static Logger logger = LogManager.getLogger(Application.class);
	public static void main(String[] args) {	
		SpringApplication.run(Application.class, args);
		System.out.println("Hello world");
		
		
		//logger
		logger.trace("This is trace message");
		logger.debug("This is debug message");
		logger.info("This is debug message");
		logger.warn("This is debug message");
		logger.error("This is debug message");
		logger.fatal("This is debug message");
		
		 
	}

}
