package com.service;





import org.springframework.stereotype.Component;

import com.google.api.client.http.HttpHeaders;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import com.model.MailModel;
@Component
public class MailService  
{
	
	
	MailModel mail ;
	String url = "https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyCArRe0FxKm4mk4fandJSNhJ3L8te8Ka1Y";
	String requestBody;
	
	public void initLogin() 
	{
		

		mail = new MailModel();
		mail.setName("adebayogboyega@yahoo.com");
		mail.setPassword("longman");
		mail.setToken(true);	
		
	}
	
	public  void loginClient() throws UnirestException
	
	{
		requestBody= "{"+"email"+":"+mail.getName()+","+"password"+mail.getPassword()+","+"returnToken"+":true}";
	            	HttpResponse<JsonNode> jsonResponse  = Unirest.post(url)
				       .header("Content-Type","application/json").body(requestBody).asJson();
		
		               int status= jsonResponse.getStatus();
		               System.out.println(""+status);
		               System.out.println("I was here");
		        
		
	}

	

	

}
