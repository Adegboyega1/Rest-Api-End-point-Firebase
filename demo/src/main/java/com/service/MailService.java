package com.service;

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
	
	public MailModel login(@RequestBody MailModel inputRequest ) 
	{
		MailModel responseBody = restTemplate.postForObject
				(url,inputRequest, MailModel.class);
		  return responseBody;
	}

}
