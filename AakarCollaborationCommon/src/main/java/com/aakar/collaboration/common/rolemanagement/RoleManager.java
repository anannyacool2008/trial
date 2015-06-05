package com.aakar.collaboration.common.rolemanagement;

import java.util.List;

import com.aakar.collaboration.common.AakarEntity;


public interface RoleManager {

	public void createRole(AakarEntity role);

	public void createRoles(List<AakarEntity> roleList);

	public void removeRole(AakarEntity role);

	public void removeRoles(List<AakarEntity> roleList);
}
