package com.aakar.collaboration.common;


public abstract class Entity {
	protected String name;
	protected String uid;
	
	protected Entity(String name, String uid) {
		super();
		this.name = name;
		this.uid = uid;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	public String getUid() {
		return uid;
	}
}
