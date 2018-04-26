package org.mishra.com.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mishra.com.controller.AdminCategoriesController;
import org.mishra.com.dao.CategorieDao;
import org.mishra.com.dao.CategorieDaoImpl;
import org.mishra.com.entity.Categories;
import org.mishra.com.service.CategorieService;
import org.mishra.com.service.CategorieServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

	private ClassPathXmlApplicationContext  context;

	public static void main(String args[])
	{
		
	}
	@Before
	public void setUp()
	{
		
	}
	//@Test
	public void test(){
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			assertTrue(true);
		}
		catch(Exception ex)
		{
			System.out.println(""+ex.getMessage());
			assertTrue(ex.getMessage(),false);
		}
	}
	
	/*  @Test
	  public void typeAnnotations() {
	    // assert
	    AssertAnnotations.assertType(
	        Activity.class, Entity.class, Table.class);
	  }
	*/
	@Test
	public void testDaoCategorie(){
		 context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		CategorieService service = (CategorieServiceImpl)  context.getBean("categorieService");
		System.out.println("***********************************************____________________________***********************");

		service.saveCategorie(new Categories("ordinaries","ordinaries","123",null));
		/*CategorieDao dao = (CategorieDaoImpl)  context.getBean("categorieDao");
		System.out.println("***********************************************____________________________***********************");
		
		dao.saveCategorie(new Categories("ordinaries","ordinaries","123",null));
*/		/*{	
		 List <Categories>list1=service.listCategories();
		 Iterator< Categories> i=list1.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 */
		//service.saveCategorie(new Categories("ordinaries","ordinaries","123",null));
	//	service.setCategories(new Categories("impriments","impriments","",null));
		
	//	List <Categories>list2=service.listCategories();
	//	assertTrue(list2.size() == list1.size()+2);
	/*}catch(Exception e){
		e.getMessage();
		System.out.println("-----------"+e+"\n"+e.getMessage());
	}*/
		
	}
	
	
}
