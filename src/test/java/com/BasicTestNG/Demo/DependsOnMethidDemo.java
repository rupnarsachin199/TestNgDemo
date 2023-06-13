package com.BasicTestNG.Demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethidDemo 
{
  @Test(priority=1)
  public void register() 
  {
	  System.out.println("User Resgistration");
	  AssertJUnit.assertEquals(true, false);
  }
  
  @Test(priority=2, dependsOnMethods="register")
  public void login()
  {
	  System.out.println("User Login");
  }
  
  @Test(priority=3, invocationCount=3)
  public void search()
  {
	  System.out.println("User Search");
  }
}
