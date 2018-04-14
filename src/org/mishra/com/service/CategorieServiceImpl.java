package org.mishra.com.service;

import java.util.List;

import org.mishra.com.dao.CategorieDao;
import org.mishra.com.entity.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service(value="categorieService")
@Component
public class CategorieServiceImpl implements CategorieService{

	@Autowired
	private CategorieDao categorieDao;
	
	@Override
	public List<Categories> listCategories()
	{
	return categorieDao.listCategories();
	}
}
