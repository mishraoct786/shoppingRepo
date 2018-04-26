package org.mishra.com.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.stereotype.Component;



@Entity
@Component
public class Categories implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idCategorie;
	
	//@NotEmpty
	//@Size(max=4,min=100)
	private String nonCategorie;
	
	private String description;
	private String nonPhoto;
	
	@Lob
	private byte[] photo;

	public Categories(){
		
	}

	public Categories(String nonCategorie, String description, String nonPhoto, byte[] photo) {
		
		this.nonCategorie = nonCategorie;
		this.description = description;
		this.nonPhoto = nonPhoto;
		this.photo = photo;
	}

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

	@Override
	public String toString() {
		return "Categories [idCategorie=" + idCategorie + ", nonCategorie=" + nonCategorie + ", description="
				+ description + ", nonPhoto=" + nonPhoto + ", photo=" + Arrays.toString(photo) + "]";
	}
	
	/*@OneToMany(mappedBy="categorie")
	private Collection<Product> product = new ArrayList<Product>();
	*/
	
}
