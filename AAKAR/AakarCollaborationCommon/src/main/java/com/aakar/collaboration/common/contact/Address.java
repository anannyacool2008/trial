package com.aakar.collaboration.common.contact;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String city;
	private String state;
	private String country;
	private int zipcode;

	public Address(String addressLine1, String addressLine2,
			String addressLine3, String city, String state, String country,
			int zipcode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public int getZipcode() {
		return zipcode;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(addressLine1).append(addressLine2)
				.append(addressLine3).append(city).append(state)
				.append(country).append(zipcode).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return new EqualsBuilder().append(addressLine1, other.addressLine1)
				.append(addressLine2, other.addressLine2)
				.append(addressLine3, other.addressLine3)
				.append(city, other.city).append(state, other.state)
				.append(country, other.country).append(zipcode, other.zipcode)
				.isEquals();
	}
}
