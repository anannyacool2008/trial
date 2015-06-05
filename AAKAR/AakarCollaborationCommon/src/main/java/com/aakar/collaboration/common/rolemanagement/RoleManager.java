package com.aakar.collaboration.common.rolemanagement;

import java.util.List;

import com.aakar.collaboration.common.Entity;


public interface RoleManager {

	public void createRole(Entity role);

	public void createRoles(List<Entity> roleList);

	public void removeRole(Entity role);

	public void removeRoles(List<Entity> roleList);
}
