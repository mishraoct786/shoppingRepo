package org.mishra.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idproduct;
	
	private String designation;
	private String discription;
	private double prise;
	private  int quantity;
	
	@ManyToOne
	@JoinColumn(name="idproduct")
	private Categories category;
	

	public long getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(long idproduct) {
		this.idproduct = idproduct;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getPrise() {
		return prise;
	}

	public void setPrise(double prise) {
		this.prise = prise;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}
	
	
}
