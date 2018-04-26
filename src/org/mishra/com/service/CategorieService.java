package org.mishra.com.service;

import java.util.List;

import org.mishra.com.entity.Categories;
import org.springframework.stereotype.Service;

public interface CategorieService {
	
	public List<Categories> listCategories();

	public void modifierCategaorie(Categories c);
	public long saveCategorie(Categories c);

}
