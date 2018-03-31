package org.mishra.com.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.Mapping;

@Entity
public class Categories {
	@Id
	@GeneratedValue
	private long idCategorie;
	
	@NotEmpty
	@Size(max=4,min=20)
	
	private String nonCategorie;
	private String description;
	private String nonPhoto;
	
	@Lob
	private byte[] photo;

	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNonCategorie() {
		return nonCategorie;
	}

	public void setNonCategorie(String nonCategorie) {
		this.nonCategorie = nonCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNonPhoto() {
		return nonPhoto;
	}

	public void setNonPhoto(String nonPhoto) {
		this.nonPhoto = nonPhoto;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	/*@OneToMany(mappedBy="categorie")
	private Collection<Product> product = new ArrayList<Product>();
	*/
	
}
