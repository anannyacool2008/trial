package com.aakar.collaboration.server.partitionmanagement;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.aakar.collaboration.common.AakarEntity;
import com.aakar.collaboration.common.paritionmanagement.Partition;

@ManagedBean 
@RequestScoped
public class PartitionManagerTest  {
	 private String partitionName;
	 private String partitionId;
		public String getPartitionName() {
			return partitionName;
		}

		public void setPartitionName(String partitionName) {
			this.partitionName = partitionName;
		}

		public String getPartitionId() {
			return partitionId;
		}

		public void setPartitionId(String partitionId) {
			this.partitionId = partitionId;
		}


		public String createPartition() {
			DBPartitionmanagerImpl db=new DBPartitionmanagerImpl();
			System.out.println("\n\n\nn\n\n\n\n\n\n\n\nPartition Id is \t"+this.partitionId);
			  Partition entity=new Partition(this.partitionName,this.partitionId);
			  db.createPartition(entity);
			 // removePartition(entity);
			  return "success.xhtml";
			
		}


		public String createPartitions() {
			
			System.out.println("Inside CreatePartitions Method");
			DBPartitionmanagerImpl db=new DBPartitionmanagerImpl();
			List<AakarEntity> partitionList=new ArrayList<AakarEntity>();
			for(int i=0;i<5;i++){
				Partition entity=new Partition(this.partitionName,"1000"+i);
			 partitionList.add(entity);
			}
			db.createPartitions(partitionList);
			
			  return "success.xhtml";
		}


		public String removePartition() {
			DBPartitionmanagerImpl db=new DBPartitionmanagerImpl();
			System.out.println("\n\n\nn\n\n\n\n\n\n\n\nPartition Id is \t"+this.partitionId);
			  Partition entity=new Partition(this.partitionName,this.partitionId);
			//  db.createPartition(entity);
			  db.removePartition(entity);
			  return "success.xhtml";
			
		}

		public String removePartitions() {
			System.out.println("\n\n\nInside PartitionManagerTest removePartitions");
			DBPartitionmanagerImpl db=new DBPartitionmanagerImpl();
			List<AakarEntity> partitionList=new ArrayList<AakarEntity>();
			for(int i=0;i<5;i++){
				System.out.println("Inside for loop");
				Partition entity=new Partition(this.partitionName,"10000"+i);
			 partitionList.add(entity);
			 
			}
			db.removePartitions(partitionList);
			
			  return "success.xhtml";
			
		}
	
	

}
