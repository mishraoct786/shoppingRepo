package org.mishra.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {
	@Id
	private long idActivity;
	
	@Column
	private String data_commnad;
	@Column
	private Customer client;
	
	public long getIdActivity() {
		return idActivity;
	}
	public void setIdActivity(long idActivity) {
		this.idActivity = idActivity;
	}
	public String getData_commnad() {
		return data_commnad;
	}
	public void setData_commnad(String data_commnad) {
		this.data_commnad = data_commnad;
	}
	public Customer getClient() {
		return client;
	}
	public void setClient(Customer client) {
		this.client = client;
	}
	
}
