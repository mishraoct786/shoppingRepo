package org.mishra.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.mishra.com.entity.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value="categorieDao")
@ComponentScan
@Transactional
public class CategorieDaoImpl implements CategorieDao{

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Categories> listCategories() {
		
		Query req =em.createQuery("select c from Categarie c");
		return req.getResultList();
	}

	@Override
	public Long getIdCategoriesByObject(Categories c) {
		
		em.persist(c);
		return c.getIdCategorie();
	}

	@Override
	public Categories getCategorie(Long idCat) {
		Categories c = em.find(Categories.class,idCat );
		return c;
		
	}

	@Override
	public void modifierCategaorie(Categories c) {
		em.merge(c);
		
	}
	

}
