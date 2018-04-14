package org.mishra.com.dao;

import java.util.List;

import org.mishra.com.entity.Product;

public interface ProductDao {

	//public void productSelection();
	public Product getProduct(Long id);
	//public List<Product> productPerMoCl();
	//public List<Product>productPerCatehgari();
	public List<Product>listProducts();
	
	public void supPrimerProduct(Long id);
	public void ModifireProduct(Product p);
	public List<Product> productsSelectionnes();
	List<Product> productPerMoCl(String S);
	List<Product> productPerCatehgari(Long idCat);
	
}
