package org.mishra.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private long idproduct;

	public long getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(long idproduct) {
		this.idproduct = idproduct;
	}
}
