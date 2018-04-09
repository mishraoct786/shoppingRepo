package org.mishra.com.entity;

import java.io.Serializable;
import java.util.Collection;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCustomer;
	
	@Column
	private String nonCustomer;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	
	@OneToMany(mappedBy="customer")
	private Collection <Address> address;
	
	@OneToMany(mappedBy="client" )
	private Collection  <Activity> activity;
	
	
	public Collection<Activity> getActivity() {
		return activity;
	}
	public void setActivity(Collection<Activity> activity) {
		this.activity = activity;
	}
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getNonCustomer() {
		return nonCustomer;
	}
	public void setNonCustomer(String nonCustomer) {
		this.nonCustomer = nonCustomer;
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
	
	
	public Collection<Address> getAddress() {
		return address;
	}
	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	
	
	
	
	

}
