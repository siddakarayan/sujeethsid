package com.model2;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Userchat {

	  private String name;
	    private String password;
	    @Id
	    private String email;
	    private String address;
		private String state;
	    private String city;
	    private String mobile;
	  
				public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String string) {
			this.mobile = mobile;
		}
		
	}

