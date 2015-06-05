package com.aakar.collaboration.common.contact;

import java.util.HashSet;
import java.util.Set;

public class PhoneDetails {
	private Set<String> home;
	private Set<String> office;
	private Set<String> other;
	private Set<String> mobile;
	public PhoneDetails(Set<String> home, Set<String> office,
			Set<String> other, Set<String> mobile) {
		super();
		this.home = home;
		this.office = office;
		this.other = other;
		this.mobile = mobile;
	}
	public Set<String> getHome() {
		return home;
	}
	public Set<String> getOffice() {
		return office;
	}
	public Set<String> getOther() {
		return other;
	}
	public Set<String> getMobile() {
		return mobile;
	}
	public Set<String> getAll() {
		Set<String> all = new HashSet<String>();
		all.addAll(home);
		all.addAll(office);
		all.addAll(other);
		all.addAll(mobile);
		return all;
	}
}
