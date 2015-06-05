package com.aakar.collaboration.common.groupmanagement;

import com.aakar.collaboration.common.Entity;
/*
 * This class corresponds to the group class in picketlink
 * org.picketlink.idm.model.basic.Group
 */
public class Group extends Entity {
	private Group parent;

	public Group(String name, String uid, Group parent) {
		super(name, uid);
		this.parent = parent;
	}

	public Group getParent() {
		return parent;
	}

}
