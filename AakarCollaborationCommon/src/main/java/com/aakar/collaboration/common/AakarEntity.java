package com.aakar.collaboration.common;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@TableGenerator(name="tab", initialValue=0, allocationSize=50)
public abstract class AakarEntity {
	
	protected String name;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.TABLE, generator="tab")
	protected String uid;
	
	
	
	protected AakarEntity()
	{
		super();
	}
	
	protected AakarEntity(String name, String uid) {
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
