package org.mishra.com.controller;

import org.mishra.com.entity.Categories;
import org.mishra.com.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {  
	
	@Autowired
	private CategorieService categorieServiceImpl;
	      
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)  
	    public String index(Model model) {  
	          System.out.println("shubham mishra");
	          model.addAttribute("categorie",new Categories());
	          model.addAttribute("categories",categorieServiceImpl.listCategories());
	          
	        return "index";  
	    }  
	    @RequestMapping(value="/shubham", method=RequestMethod.GET)  
	    public String index2() {  
	          
	        return "index";  
	    } 
	    
	    @RequestMapping(value="/admin", method = RequestMethod.GET)
	    public ModelAndView visitAdmin() {
	        ModelAndView model = new ModelAndView("admin");
	        model.addObject("title", "Admministrator Control Panel");
	        model.addObject("message", "This page demonstrates how to use Spring security.");
	         
	        return model;
	    }
	} 