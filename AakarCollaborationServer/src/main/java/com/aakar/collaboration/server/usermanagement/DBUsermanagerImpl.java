package com.aakar.collaboration.server.usermanagement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.picketlink.idm.jpa.model.sample.simple.IdentityTypeEntity;

import com.aakar.collaboration.common.usermanagement.User;





public class DBUsermanagerImpl  {
	
	EntityManagerFactory emfactory = Persistence
			.createEntityManagerFactory("Eclipselink_JPA");
	
	EntityManager em = emfactory.createEntityManager();
	
	
public void createUser(User user) {

		
		em.getTransaction().begin();
		
   
	  em.persist(user);
	
	  
		em.getTransaction().commit();

		em.close();
		emfactory.close();

	}

	public void createUsers(List<User> userList) {

	}

	public void removeUser(User user) {
		
		em.getTransaction().begin();
		
	    
		 
		   User u=em.find(User.class,user.getUid());
		   System.out.println("\n\n\nn\n\n\n\n\n\n\n\nUser id Id is \t"+u.getUid());
		   em.remove(u);
		  
			em.getTransaction().commit();

			em.close();
			emfactory.close();


	}

	public void removeUsers(List<User> userList) {

		for (int i = 0; i < userList.size(); i++)
			removeUser(userList.get(i));

	}

}
