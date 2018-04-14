package org.mishra.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.action.internal.EntityIdentityInsertAction;
import org.mishra.com.entity.Customer;
import org.mishra.com.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private EntityManager em;

	@Override
	public List<Product> productsSelectionnes() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select p from Product p where p.selectionne=true");
		return req.getResultList();
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> productPerMoCl(String mc) {
		Query req=em.createQuery("select p from Product p where p.designation like :x pr p.desciption like x");
	req.setParameter("x","%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public List<Product> productPerCatehgari(Long idCat) {
		Query req=em.createQuery("select p from Product p where p.categories.idCategorie =: x");
		req.setParameter("x",idCat);
		return req.getResultList();

	}

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supPrimerProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModifireProduct(Product p) {
		em.merge(p);
		
	}
	
}
