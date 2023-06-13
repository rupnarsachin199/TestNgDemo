package com.BasicTestNG.Demo;

import org.testng.annotations.*;

public class AnnotationsDemo 
{
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("This is beforeSuite annotation example");
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("This is beforeClass annotation example");
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("This is beforeTest annotation example");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("This is beforeMethod example");
  }
  
  @Test
  public void registration()
  {
	  System.out.println("User Registration");
  }
  
  @Test
  public void logIn()
  {
	  System.out.println("User Login");
  }
  
  @Test
  public void search()
  {
	  System.out.println("User Search");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("This is afterMethod annoataion example");
  }
  
  @AfterTest
  public void afterClass()
  {
	  System.out.println("This is afterClass annoataion example");
  }
  
  @AfterClass
  public void afterTest()
  {
	  System.out.println("This is afterTest annoataion example");
  }
  
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("This is aftersuite annotation example");
  }
  
}
