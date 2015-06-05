package com.aakar.collaboration.server.rolemanagement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.picketlink.idm.jpa.model.sample.simple.PartitionTypeEntity;
import org.picketlink.idm.jpa.model.sample.simple.RoleTypeEntity;

import com.aakar.collaboration.common.AakarEntity;
import com.aakar.collaboration.common.rolemanagement.RoleManager;



public class DBRolemanagerImpl implements RoleManager {

	 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA" );
	  EntityManager em=  emfactory.createEntityManager();
	
	@Override
	public void createRole(AakarEntity role) {
		em.getTransaction().begin();
		RoleTypeEntity rte=new RoleTypeEntity();
		PartitionTypeEntity partition=new PartitionTypeEntity();
		partition.setId(role.getUid());
		System.out.println("\n\n\n\n\n\n\n\nplace 1");
		rte.setPartition(partition);
		System.out.println("\n\n\n\n\n\n\n\nplace 2");
		rte.setName(role.getName());
		System.out.println("\n\n\n\n\n\n\n\nplace 3");
		//rte.setId(role.getUid());
		rte.setId(role.getUid());
		System.out.println("\n\n\n\n\n\n\n\nplace 4");
		em.persist(rte);
		System.out.println("\n\n\n\n\n\n\n\nplace 5");
		em.getTransaction().commit();
		System.out.println("\n\n\n\n\n\n\n\nplace 6");
		em.close();
		emfactory.close();
		
	}

	@Override
	public void createRoles(List<AakarEntity> roleList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRole(AakarEntity role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRoles(List<AakarEntity> roleList) {
		// TODO Auto-generated method stub
		
	}

}
