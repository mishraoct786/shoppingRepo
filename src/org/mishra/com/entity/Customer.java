package org.mishra.com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Customer() {
		
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idClent;
	
	@Column
	private String nonClient;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@JoinColumn
	private Address address;
	

	
	public Long getIdClent() {
		return idClent;
	}
	public void setIdClent(Long idClent) {
		this.idClent = idClent;
	}
	public String getNonClient() {
		return nonClient;
	}
	public void setNonClient(String nonClient) {
		this.nonClient = nonClient;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
