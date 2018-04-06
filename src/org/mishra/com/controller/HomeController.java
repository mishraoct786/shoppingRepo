package org.mishra.com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller

public class HomeController {  
	      
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)  
	    public String index() {  
	          System.out.println("shubham mishra");
	        return "index";  
	    }  
	    @RequestMapping(value="/shubham", method=RequestMethod.GET)  
	    public String index2() {  
	          
	        return "index";  
	    } 
	} 