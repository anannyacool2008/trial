package com.aakar.collaboration.server.usermanagement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class UserDt {

	@Id
	private String uid1;
	private String name1;
	public String getUid1() {
		return uid1;
	}
	public void setUid1(String uid1) {
		this.uid1 = uid1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	
	public UserDt()
	{
		super();
	}
	
	
}
