package com.aakar.collaboration.common.paritionmanagement;

import java.util.List;

import com.aakar.collaboration.common.AakarEntity;

public interface PartitionManager {

	public void createPartition(AakarEntity partition);

	public void createPartitions(List<AakarEntity> partitionList);

	public void removePartition(AakarEntity partition);

	public void removePartitions(List<AakarEntity> partitionList);
	
}
