package org.mishra.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.mishra.com.entity.Categories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@ComponentScan("org.mishra.com.dao")
@Repository(value="categorieDao")
@org.springframework.transaction.annotation.Transactional
public class CategorieDaoImpl implements CategorieDao{

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Categories> listCategories() {
		System.out.println("********************");
		List listCat=null;
		
		Query req =em.createQuery("select c from Categories c");
		 listCat = req.getResultList();
		System.out.println("*******************"+listCat);
		return listCat;
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

	public EntityManager getEm() {
		return em;
	}

	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public long saveCategorie(Categories c) {
		System.out.println("-----------------------##########_____________**********************************");
		em.persist(c);
		return c.getIdCategorie();
	}
	

}
