package com.aakar.collaboration.server.usermanagement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.picketlink.idm.jpa.model.sample.simple.IdentityTypeEntity;

import com.aakar.collaboration.common.usermanagement.User;
import com.aakar.collaboration.common.usermanagement.UserManager;



public class DBUsermanagerImpl implements UserManager {
	
	EntityManagerFactory emfactory = Persistence
			.createEntityManagerFactory("Eclipselink_JPA");
	
	EntityManager em = emfactory.createEntityManager();
	
public void createUser(User user) {

		
		em.getTransaction().begin();
		
		
  UserDt u=new UserDt();
	    u.setName1(user.getName());
	    u.setUid1(user.getUid());
		
		
		em.persist(u);
		em.getTransaction().commit();

		em.close();
		emfactory.close();

	}

	public void createUsers(List<User> userList) {
		
		for (int i = 0; i < userList.size(); i++)
			createUser(userList.get(i));

	}

	public void removeUser(User user) {
		
		em.getTransaction().begin();
		UserDt u = em.find( UserDt.class,user.getUid());
	      em.remove(u);
	      em.getTransaction( ).commit( );
	      em.close( );
	      emfactory.close( );

	}

	public void removeUsers(List<User> userList) {

		for (int i = 0; i < userList.size(); i++)
			removeUser(userList.get(i));

	}

}
