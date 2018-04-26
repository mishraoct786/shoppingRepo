package org.mishra.com.test;

public class TestController
{
	
}

/*import org.mishra.com.controller.AdminCategoriesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;

import java.util.List;
import org.mishra.com.controller.*;
 
@SpringBootApplication
//@ComponentScan("org.mishra.com.controller")
@ComponentScan(basePackages = {
        "org.mishra.com.entity",//"com.webTemplate.config.web",  // MVC @Configuration
        "org.mishra.com.dao",//"com.webTemplate.config.security", // Security @Configuration
        "org.mishra.com.service",//"com.webTemplate.config.jpa", // Database @Configuration -> does Entity Scan and Repository scan
        "org.mishra.com.controller",//"com.webTemplate.service", // Service scan @Service
        "org.mishra.com.advice",//"com.webTemplate.controler", // Controller scan @Controller
})
public class TestController {
 
    private static Object products;

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TestController.class, args);
      
		AdminCategoriesController controller = (AdminCategoriesController) ctx.getBean("adminCategoriesController");
         Model model;
		//products = controller.index1(model);
 
        for(Product product : products){
            System.out.println(product.getDescription());
        }
    }
}*/

