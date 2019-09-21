package com.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)

public class MailModel {
	

		private String name;
		private String password;
		private boolean token;
		public boolean isToken() {
			return token;
		}
		public void setToken(boolean token) {
			this.token = token;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	

}
