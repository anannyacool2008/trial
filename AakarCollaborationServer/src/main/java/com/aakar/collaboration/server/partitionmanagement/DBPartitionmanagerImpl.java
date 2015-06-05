package com.aakar.collaboration.server.partitionmanagement;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.picketlink.idm.jpa.model.sample.simple.PartitionTypeEntity;

import com.aakar.collaboration.common.AakarEntity;
import com.aakar.collaboration.common.paritionmanagement.PartitionManager;



public class DBPartitionmanagerImpl implements PartitionManager {
	 
	
	 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA" );
	  EntityManager em=  emfactory.createEntityManager();
	
   
	
		public void createPartition(AakarEntity partition) {
			em.getTransaction().begin();
			PartitionTypeEntity pte=new PartitionTypeEntity();
			pte.setId(partition.getUid());
			pte.setName(partition.getName());
			em.persist(pte);
			em.getTransaction().commit();
			em.close();
			emfactory.close();
		}

		public void createPartitions(List<AakarEntity> partitionList) {
			System.out.println("\n\n\n\n\n\nInside Createpartitions of DB class \n\n\n");
			
			for(AakarEntity e:partitionList)
			{
				
				em.getTransaction().begin();
				PartitionTypeEntity pte=new PartitionTypeEntity();
				pte.setId(e.getUid());
				pte.setName(e.getName());
				em.persist(pte);
				em.getTransaction().commit();
			}
			em.close();
			emfactory.close();
			
		}

		public void removePartition(AakarEntity partition) {
			em.getTransaction().begin();
			PartitionTypeEntity partition1 = em.find( PartitionTypeEntity.class, partition.getUid() );
			em.remove(partition1);
			em.getTransaction().commit( );
			em.close( );
		    emfactory.close( );
			
			
		}

		public void removePartitions(List<AakarEntity> partitionList) {
			System.out.println("\n\n\nInside DB removePartitions");
			for(AakarEntity e:partitionList)
			{
				System.out.println("Inside for loop of Removepartitions");
				em.getTransaction().begin();
				System.out.println("\n\n"+e.getUid()+"\n\n");
				PartitionTypeEntity partition = em.find( PartitionTypeEntity.class, e.getUid() );
				em.remove(partition);
				em.getTransaction().commit( );
			}
			em.close( );
		    emfactory.close( );
		}
		
		
	}