package org.mishra.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.mishra.com.dao.CategorieDao;
import org.mishra.com.entity.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("categorieService")
@ComponentScan("org.mishra.com.service")
public class CategorieServiceImpl implements CategorieService{

	@Autowired
	private CategorieDao categorieDaoImpl;
	
	@Override
	public List<Categories> listCategories() 
	{
	return categorieDaoImpl.listCategories();
	}
	
	

	@Override
	public void modifierCategaorie(Categories c) {
		categorieDaoImpl.modifierCategaorie(c);
		
	}

	@Override
	public long saveCategorie(Categories c) {
		return categorieDaoImpl.saveCategorie(c);
	}

	
}
