package com.aakar.collaboration.common.usermanagement;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.aakar.collaboration.common.contact.ContactDetails;

@Entity
@Table
public class UserDetails {
	@Id
	private String userid;
	private String lastName;
	private String userName;
	private String password;
	private String firstName;
	private String middleName;
	
	//private ContactDetails contact;

	public UserDetails()
	{
		super();
	}
	
	public UserDetails(String userid)
	{
		super();
		this.userid=userid;
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public UserDetails(String userName, String password, String firstName,
			String middleName, String lastName, ContactDetails contact) {
		super();
        
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		//this.contact = contact;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

//	public ContactDetails getContact() {
//		return contact;
//	}
}
