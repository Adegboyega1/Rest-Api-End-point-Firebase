package com.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.model.MailModel;

public class MailService  
{
	RestTemplate restTemplate;
	public MailService()
	{
		restTemplate = new RestTemplate();
		
	}
	String url = "https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyCArRe0FxKm4mk4fandJSNhJ3L8te8Ka1Y";
	
	public void login(@RequestBody MailModel inputRequest ) 
	{
		
		  
		  ResponseEntity<MailModel> response = restTemplate.postForEntity(url,inputRequest, MailModel.class);
		 System.out .println( response.getBody().toString());
	}

}
