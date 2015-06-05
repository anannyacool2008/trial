package com.aakar.collaboration.server.usermanagement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.aakar.collaboration.common.usermanagement.User;
import com.aakar.collaboration.common.usermanagement.UserDetails;






@ManagedBean
@RequestScoped
public class UserTest {
	
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


public String createUser()
{
	
	DBUsermanagerImpl us=new DBUsermanagerImpl();
		System.out.println("\n\n\nn\n\n\n\n\n\n\n\nUser id Id is \t"+this.uid1);
		  User ut=new User(this.name1,this.uid1);
		  UserDetails ud=new UserDetails(this.uid1);
		  ut.setUserDetails(ud);
		us.createUser(ut);
		 // removePartition(entity);
		  return "success.xhtml";
	
}
public String removeUser()
{
	
	DBUsermanagerImpl us=new DBUsermanagerImpl();
	System.out.println("\n\n\nn\n\n\n\n\n\n\n\nUser id Id is \t"+this.uid1);
	  User ut=new User(this.name1,this.uid1);
	  
	
	us.removeUser(ut);
	 return "success.xhtml";
}
	

}
