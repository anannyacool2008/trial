package com.aakar.collaboration.common.paritionmanagement;

import java.util.List;

import com.aakar.collaboration.common.Entity;

public interface PartitionManager {

	public void createPartition(Entity partition);

	public void createPartitions(List<Entity> partitionList);

	public void removePartition(Entity partition);

	public void removePartitions(List<Entity> partitionList);
	
}
