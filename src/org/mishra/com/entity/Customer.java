package org.mishra.com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	private String nonClient;
	private String email;
	private String phone;
	private String address;
	
	public Customer(String nonClient, String email, String phone, String address) {
		//super();
		this.nonClient = nonClient;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
