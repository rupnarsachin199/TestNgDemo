package com.BasicTestNG.Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionDemo 
{
  @Test(priority=1)
  public void hardAssertDemoTest() 
  {
	  String act  ="Selenium webdriver is a webui autoamtion library";
	  //String exp  ="Selenium webdriver is a webui autoamtion library";
	  
	  //String exp  ="Selenium webdriver is a webui autoamtion";
	  
	  //Assert.assertEquals(act, exp, "not matched");
	  
	  
	  //Assert.assertTrue(act.contains(exp));
	  
	  
	  Assert.assertFalse(act.contains("testng"));
	  System.out.println("Hard assertion is completed");
  }
  
  
  @Test(priority=2)
  public void softAssertDemoTest()
  {
	  String act  ="Selenium webdriver is a webui autoamtion library";
	  //String exp  ="Selenium webdriver is a webui autoamtion";
	  
	  
	  SoftAssert sf = new SoftAssert();
	  //sf.assertEquals(act, exp, "not moatched");
	  
	  //sf.assertTrue(act.contains("testng"));
	  
	  sf.assertFalse(act.contains("testng"));
	  sf.assertAll();
  }
}
