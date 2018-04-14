package org.mishra.com.dao;

import java.util.List;

import org.mishra.com.entity.Categories;

public interface CategorieDao {
	
	public List<Categories> listCategories();
	public Long getIdCategoriesByObject(Categories c);
	public Categories getCategorie(Long Idcat);
	public void modifierCategaorie(Categories c);
	
}
