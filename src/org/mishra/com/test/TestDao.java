package org.mishra.com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

	/*public static void main(String args[])
	{
		
	}*/
	@Before
	public void setUp()
	{
		
	}
	@Test
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
	
	  /*@Test
	  public void typeAnnotations() {
	    // assert
	    AssertAnnotations.assertType(
	        Activity.class, Entity.class, Table.class);
	  }*/
}
