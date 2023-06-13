package com.open.Browser;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethds 
{
  @Test(priority=1)
  public void register()
  {
	  System.out.println("User Register");
	  AssertJUnit.assertEquals(true, false);
  }
  
  @Test(priority=2, dependsOnMethods="register")
  public void login()
  {
	  System.out.println("User Login");
  }
}
