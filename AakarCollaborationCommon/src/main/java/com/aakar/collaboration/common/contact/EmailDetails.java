package com.aakar.collaboration.common.contact;

import java.util.HashSet;
import java.util.Set;

public class EmailDetails {
	private Set<String> personal;
	private Set<String> office;
	private Set<String> other;
	
	public EmailDetails(Set<String> personal, Set<String> office,
			Set<String> other) {
		super();
		this.personal = personal;
		this.office = office;
		this.other = other;
	}

	public Set<String> getPersonal() {
		return personal;
	}

	public Set<String> getOffice() {
		return office;
	}

	public Set<String> getOther() {
		return other;
	}

	public Set<String> getAll() {
		Set<String> all = new HashSet<String>();
		all.addAll(personal);
		all.addAll(office);
		all.addAll(other);
		return all;
	}
}
