package com.aakar.collaboration.common.usermanagement;

import com.aakar.collaboration.common.contact.ContactDetails;

public class UserDetails {
	private String userName;
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;
	private ContactDetails contact;

	public UserDetails(String userName, String password, String firstName,
			String middleName, String lastName, ContactDetails contact) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.contact = contact;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
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

	public ContactDetails getContact() {
		return contact;
	}
}
