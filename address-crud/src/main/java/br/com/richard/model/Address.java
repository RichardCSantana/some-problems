/**
 * 
 */
package br.com.richard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author richard
 *
 */
@Entity
public class Address implements IAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String street;
	@Column(nullable = false)
	private Integer number;
	private String apartmentNumber;
	private String neighborhood;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private String zipcode;

	public Address() {

	}

	public Address(String street, String neighborhood, String city,
			String state, String zipcode, String apartmentNumber, Integer number) {
		this.street = street;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.number = number;
		this.apartmentNumber = apartmentNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.richard.model.IAddress#getStreet()
	 */
	@Override
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.richard.model.IAddress#getNeighborhood()
	 */
	@Override
	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.richard.model.IAddress#getCity()
	 */
	@Override
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.richard.model.IAddress#getState()
	 */
	@Override
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.richard.model.IAddress#getZipcode()
	 */
	@Override
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public void copyProperties(Address address) {
		this.setCity(address.getCity());
		this.setNeighborhood(address.getNeighborhood());
		this.setState(address.getState());
		this.setStreet(address.getStreet());
		this.setZipcode(address.getZipcode());
		this.setApartmentNumber(address.getApartmentNumber());
		this.setNumber(address.getNumber());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
