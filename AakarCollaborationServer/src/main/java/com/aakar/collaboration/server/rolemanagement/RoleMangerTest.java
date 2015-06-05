package com.aakar.collaboration.server.rolemanagement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.aakar.collaboration.common.rolemanagement.Role;

@ManagedBean
@SessionScoped
public class RoleMangerTest {
	
	private String roleName;
	private String roleId;

	public String createRole() {
		DBRolemanagerImpl db=new DBRolemanagerImpl();
		System.out.println("\n\n\nn\n\n\n\n\n\n\n\nPartition Id is \t"+this.roleId);
		  Role r=new Role(this.roleName,this.roleId);
		  db.createRole(r);
		  return "success.xhtml";
		
	}

	
	public String createRoles() {
		return roleId;
		// TODO Auto-generated method stub
		
	}

	
	public String removeRole() {
		return roleId;
		// TODO Auto-generated method stub
		
	}

	
	public String removeRoles() {
		return roleId;
		// TODO Auto-generated method stub
		
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
