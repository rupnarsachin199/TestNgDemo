package com.open.Browser;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2 
{
	@Test(priority=1)
	  public void register()
	  {
		  System.out.println("User Register");;
	  }
	  
	  @Test(priority=2, invocationCount=3)
	  public void login()
	  {
		  System.out.println("User Login");
	  }
	  
	  @Test(priority=3)
	  public void search()
	  {
		  System.out.println("User Search");
	  }
	  
	  @Test(priority=4)
	  public void addTocart()
	  {
		  System.out.println("User AddToCart");
	  }
}
