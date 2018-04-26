package org.mishra.com.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.httpclient.methods.RequestEntity;
import org.mishra.com.entity.Categories;
import org.mishra.com.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@ComponentScan("org.mishra.com.controller")
public class AdminCategoriesController {
	
	@Autowired
	private CategorieService categorieService;
	
	@RequestMapping(value = { "/saveCat" }, method = RequestMethod.POST)
	public String saveCat(@Valid Categories c, BindingResult bindingResult,Model model, MultipartFile file) throws IOException
	{
		if(bindingResult.hasErrors()){
			model.addAttribute("categories",categorieService.listCategories());
			return "categories";
			}
		
		if(!file.isEmpty())
		{
		c.setPhoto(file.getBytes());
		}
		else{
			if( Long.valueOf(c.getIdCategorie()) == null) 
				{
				Categories cat =(Categories)model.asMap().get("editedCat");
				c.setPhoto(cat.getPhoto());
				}
		}
		
		
		if(Long.valueOf(c.getIdCategorie()) == null)
		{
			categorieService.saveCategorie(c);
		}
		else
			categorieService.modifierCategaorie(c);
		model.addAttribute("categorie",new Categories());
        model.addAttribute("categories",categorieService.listCategories());
       return "categories";
	}
	@RequestMapping(value = { "/index1" }, method = RequestMethod.GET)  
    public String index1(Model model) {  
		
		/*try {
			model.addAttribute("categories",categorieServiceImpl.listCategories());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		model.addAttribute("categorie",new Categories());
        model.addAttribute("categories",categorieService.listCategories());
        
        return "categories";  
    } 
	@RequestMapping(value = { "/getEntity" }, method = RequestMethod.GET)  
    public RequestEntity index100(HttpSession http) {  
	Model model=(Model) new ModelMap();
		model.addAttribute("categorie",new Categories());
		try {
			model.addAttribute("categories",categorieService.listCategories());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		http.setAttribute("Admin", "shubham");
        //return "categories1";  
		return null;
    } 
}
