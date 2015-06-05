package com.aakar.collaboration.common;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Relation {
	private String name;
	private long id;
	private String description;
	private AakarEntity relationer;
	private AakarEntity relationee;

	public Relation(String name, long id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relation other = (Relation) obj;
		return new EqualsBuilder().append(id, other.id).isEquals();
	}

}
