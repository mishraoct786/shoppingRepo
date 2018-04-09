package org.mishra.com.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Activity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idActivity;
	
	private String dateActivity;

	@ManyToOne
	@JoinColumn(name="idCustomer")
	private Customer client;
	
	
	@OneToMany(mappedBy="activityClient")
	private Collection<ProductActivity>productActivity ;
	
	
	public long getIdActivity() {
		return idActivity;
	}
	public void setIdActivity(long idActivity) {
		this.idActivity = idActivity;
	}

	public Customer getClient() {
		return client;
	}
	public void setClient(Customer client) {
		this.client = client;
	}
	public String getDataCommnad() {
		return dateActivity;
	}
	public void setDataCommnad(String dataCommnad) {
		this.dateActivity = dataCommnad;
	}
	public Collection<ProductActivity> getProductActivity() {
		return productActivity;
	}
	public void setProductActivity(Collection<ProductActivity> productActivity) {
		this.productActivity = productActivity;
	}
}
