package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.firebase.auth.FirebaseToken;
import com.model.MailModel;
import com.service.MailService;

@Component
@RestController
public class AuthenticationController {
	
	
	MailService loginService;
	public AuthenticationController()
	{
		loginService = new MailService();
	}
	@RequestMapping(value="/login",method=RequestMethod.GET,consumes="application/json",produces="application/json")
	public String login(@RequestBody MailModel inputRequest) 
	{
		
		
		
		return "";
	}

}
