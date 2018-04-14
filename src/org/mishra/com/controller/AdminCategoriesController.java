package org.mishra.com.controller;


import org.mishra.com.entity.Categories;
import org.mishra.com.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class AdminCategoriesController {
	
	@Autowired
	private CategorieService categorieServiceImpl;
	
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)  
    public String index(Model model) {  
		model.addAttribute("categorie",new Categories());
		model.addAttribute("categories",categorieServiceImpl.listCategories());
        return "categories1";  
    }  
}
