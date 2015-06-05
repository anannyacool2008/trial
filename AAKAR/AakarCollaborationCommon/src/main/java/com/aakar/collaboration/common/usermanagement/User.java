package com.aakar.collaboration.common.usermanagement;

import com.aakar.collaboration.common.Entity;


/*
 * This class corressponds to the user class in picketlink
 * org.picketlink.idm.model.basic.User
 */

public class User extends Entity {
	private UserDetails userDetails;

	public User(String name, String uid) {
		super(name, uid);
		// TODO Auto-generated constructor stub
	}

	public User(String name, String uid, UserDetails userDetails) {
		super(name, uid);
		this.userDetails = userDetails;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}
}
