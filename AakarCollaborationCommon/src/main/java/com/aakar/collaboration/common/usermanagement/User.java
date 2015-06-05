package com.aakar.collaboration.common.usermanagement;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.aakar.collaboration.common.AakarEntity;



/*
 * This class corressponds to the user class in picketlink
 * org.picketlink.idm.model.basic.User
 */

@Entity
@Table
public class User extends AakarEntity {
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private UserDetails userDetails;

	
	public User()
	{
		super();
	}
	
	public User(String name, String uid) {
		super(name, uid);
		// TODO Auto-generated constructor stub
	}

   public User(String name, String uid, UserDetails userDetails) {
	super(name, uid);
		this.userDetails = userDetails;
	}

   
   
	public void setUserDetails(UserDetails userDetails) {
	this.userDetails = userDetails;
}

	public UserDetails getUserDetails() {
		
	return userDetails;
	}
}
