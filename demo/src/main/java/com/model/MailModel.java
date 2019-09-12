package com.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)

public class MailModel {
	
	private String name="adebayogboyega@yahoo.com";
	private String password="longman";
	boolean token;

}
