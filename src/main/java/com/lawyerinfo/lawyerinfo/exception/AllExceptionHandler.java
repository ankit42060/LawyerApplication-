package com.lawyerinfo.lawyerinfo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class AllExceptionHandler {

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentTypeMismatchException ex){
		Map<String,String> errmap = new HashMap<>();
		errmap.put("error message", "Please enter proper input");
		return errmap;
	}
	
	@ExceptionHandler(LawyerNotFoundException.class)
	public Map<String,String> handleBusinessException(LawyerNotFoundException ex){
		Map<String,String> errmap = new HashMap<>();
		errmap.put("error messsage", "Lawyer is not present please wait...");
		return errmap;
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public Map<String,String>  handleBusinessException1(HttpMessageNotReadableException ex){
		Map<String,String> errmap = new HashMap<>();
		errmap.put("error message", "You have missed some field to fill");
		return errmap;
	}
	
	@ExceptionHandler(ClientNotFoundException.class)
	public Map<String,String> handleBusinessException2(ClientNotFoundException ex){
		Map<String,String> errmap = new HashMap<>();
		errmap.put("error message", "Client is not present please wait");
		return errmap;
	}
	
	@ExceptionHandler( FileNotFoundException.class)
	public Map<String,String> handleBusinessException3(FileNotFoundException ex){
		Map<String,String> errmap = new HashMap<>();
		errmap.put("error message", "file is not present which you search please wait");
		return errmap;
	}
	
	
	
	
}
